package RandomSadari;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Test 
{

	public static void main(String[] args) {
			Random random = new Random();
			Scanner sc = new Scanner(System.in);

			System.out.println("사람수 입력:");
			int num_crew = sc.nextInt(); // 사람수 = num_crew 입력받기
			System.out.println("팀수입력 :");
			int crew = sc.nextInt(); // 팀수 = crew 입력받기
			int[] num_random = new int[num_crew]; // 팀추첨 변수 = num_random 생성
			for (int i = 0; i < num_random.length; i++) 
			{
			num_random[i] = random.nextInt(num_crew); // 팀원 추첨할 변수 배열 생성
				for(int j=0; j<i; j++)
				{
					if(num_random[i]==num_random[j]) {i--; break;}	        	
				}	 
		    }
			System.out.println(Arrays.toString(num_random));
	}
}
