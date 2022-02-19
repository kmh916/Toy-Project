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
                System.out.println("당첨번호는"+Arrays.toString(numout)+"입니다.");
                System.out.println("입력번호는"+Arrays.toString(numin)+"입니다.");
                System.out.printf("%d개맞았습니다.",num_cor);
        	  if(num_cor==6) {System.out.println("1등당첨!!!!!!!!!");}
        	  else if(num_cor==5) {System.out.println("3등입니다.");}
        	  else if(num_cor==4) {System.out.println("4등입니다.");}
                else if(num_cor==3) {System.out.println("5등입니다.");}
                else {System.out.println("꽝 ㅋ");}
            }
     }