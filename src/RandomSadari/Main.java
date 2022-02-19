package RandomSadari;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main 
{
    
	
	
	public static void main(String[] args) 
	{   Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int k=0;
		System.out.println("사람수 입력:");
		int num_crew = sc.nextInt();                        //사람수 = num_crew 입력받기
	    System.out.println("팀수입력 :");
		int crew = sc.nextInt();                           //팀수 = crew 입력받기
		int div_crew = num_crew/crew;                     
		String[] name_crew = new String[num_crew];          // 사람이름 = name_crew배열 생성
		int[] num_random = new int[num_crew];               //팀추첨 변수 =  num_random 생성
		String[][] crew2 = new String[crew][div_crew]; 	//나눈 팀원들을 담을 배열
		
		for(int i=0;i<name_crew.length;i++)                 // 사람이름 입력받기 
		{   System.out.println(i+1 +"번째 사람이름 입력 :" );
			name_crew[i] = sc.next();
		}
		
		for (int i = 0; i < num_random.length; i++) 
		{
		num_random[i] = random.nextInt(num_crew); // 팀원 추첨할 변수 배열 생성- 중복없음
			for(int j=0; j<i; j++)
			{
				if(num_random[i]==num_random[j]) {i--; break;}	        	
			}	 
	    }
		
		for (int i = 0; i < crew2.length; i++) 
		{
			for (int j = 0; j < crew2[i].length; j++) 
			{
				crew2[i][j] = name_crew[num_random[k]];
				k++;
			}
		}
		
		for(int i=0;i<crew2.length;i++)
		{   System.out.print(i+1+"팀   ");
			System.out.println(Arrays.toString(crew2[i]));
		}
		sc.close();
	}
}
