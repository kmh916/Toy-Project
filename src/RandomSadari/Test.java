package RandomSadari;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Test 
{

	public static void main(String[] args) {
			Random random = new Random();
			Scanner sc = new Scanner(System.in);

			System.out.println("����� �Է�:");
			int num_crew = sc.nextInt(); // ����� = num_crew �Է¹ޱ�
			System.out.println("�����Է� :");
			int crew = sc.nextInt(); // ���� = crew �Է¹ޱ�
			int[] num_random = new int[num_crew]; // ����÷ ���� = num_random ����
			for (int i = 0; i < num_random.length; i++) 
			{
			num_random[i] = random.nextInt(num_crew); // ���� ��÷�� ���� �迭 ����
				for(int j=0; j<i; j++)
				{
					if(num_random[i]==num_random[j]) {i--; break;}	        	
				}	 
		    }
			System.out.println(Arrays.toString(num_random));
	}
}
