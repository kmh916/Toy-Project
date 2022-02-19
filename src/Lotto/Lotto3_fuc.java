package Lotto;
import java.util.Arrays;
import java.util.Random;

public class Lotto3_fuc 
{
    
     static void generate_nonDup(int num[]) 
     { Random random = new Random();
       for(int i=0;i<num.length;i++)
         { num[i] = random.nextInt(45)+1;
            for(int j=0; j<i; j++)
              {
              if(num[i]==num[j]) {i--; break;}	        	
              }	    	
         }
     }
  	
     static void align(int num[]) 
	{
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j]; 
					num[j] = temp;
				}
			}
		}
	}
  	
        static void grade(int numin[],int numout[],int num_cor)
       {
   	 for(int i=0;i<numin.length;i++)
	    {
	    	for(int j=0;j<i+1;j++)
	    	{
	    	if(numin[i]==numout[j]) 	    	
	    	num_cor++;  
	    	}
	    }
                System.out.println("��÷��ȣ��"+Arrays.toString(numout)+"�Դϴ�.");
                System.out.println("�Է¹�ȣ��"+Arrays.toString(numin)+"�Դϴ�.");
                System.out.printf("%d���¾ҽ��ϴ�.",num_cor);
        	  if(num_cor==6) {System.out.println("1���÷!!!!!!!!!");}
        	  else if(num_cor==5) {System.out.println("3���Դϴ�.");}
        	  else if(num_cor==4) {System.out.println("4���Դϴ�.");}
                else if(num_cor==3) {System.out.println("5���Դϴ�.");}
                else {System.out.println("�� ��");}
            }
     }