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
		System.out.println("����� �Է�:");
		int num_crew = sc.nextInt();                        //����� = num_crew �Է¹ޱ�
	    System.out.println("�����Է� :");
		int crew = sc.nextInt();                           //���� = crew �Է¹ޱ�
		int div_crew = num_crew/crew;                     
		String[] name_crew = new String[num_crew];          // ����̸� = name_crew�迭 ����
		int[] num_random = new int[num_crew];               //����÷ ���� =  num_random ����
		String[][] crew2 = new String[crew][div_crew]; 	//���� �������� ���� �迭
		
		for(int i=0;i<name_crew.length;i++)                 // ����̸� �Է¹ޱ� 
		{   System.out.println(i+1 +"��° ����̸� �Է� :" );
			name_crew[i] = sc.next();
		}
		
		for (int i = 0; i < num_random.length; i++) 
		{
		num_random[i] = random.nextInt(num_crew); // ���� ��÷�� ���� �迭 ����- �ߺ�����
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
		{   System.out.print(i+1+"��   ");
			System.out.println(Arrays.toString(crew2[i]));
		}
		sc.close();
	}
}
