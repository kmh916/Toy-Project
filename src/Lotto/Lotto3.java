package Lotto;
import java.util.Scanner;
import java.util.Arrays;
public class Lotto3 
{   
	
  	
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
		int mode;
		int one=0;
	 	while(true) {
		int[] in_num = new int[6];
	 	int[] out_num = new int[6];
	 	int cor=0;
	 	
	 	System.out.println("�ڡ١ڡڡ١ٷζ���÷��ڡ١ڡ١ڡ�");
	    System.out.println("��弱�� 1=�ڵ� 2=���� 3=1��ɶ������Ѵ�! 0=����");
	    mode = sc.nextInt();
	if(mode==1)
	{
		Lotto3_fuc.generate_nonDup(out_num);
		Lotto3_fuc.align(out_num);		
		
		Lotto3_fuc.generate_nonDup(in_num);
		Lotto3_fuc.align(in_num);
		
		Lotto3_fuc.grade(in_num,out_num,cor);      
		} //mode 1
	else if(mode==2) 
	{
	    System.out.println("��ȣ�� �Է����ּ���");	    
	    for(int i=0;i<in_num.length;i++)
	    {   
	    	System.out.printf("%d��° ��ȣ �Է�",i+1);	        
	    	in_num[i] = sc.nextInt();	
	    	if(!(in_num[i]<=45&&in_num[i]>0))
	    	{i--; System.out.println("�ζ� ��ȣ�� 1~45�Դϴ�");}
	    	for(int j=0; j<i; j++)
	        {
	        	if(in_num[i]==in_num[j]) 
	        	{i--;
	        	System.out.println("�ߺ��Ǿ����ϴ�. �ٽ��Է����ּ���");
	        	break;
	        	}		        	
	        }
	    }
	    Lotto3_fuc.align(in_num);
	    Lotto3_fuc.generate_nonDup(out_num);
	    Lotto3_fuc.align(out_num);	
    
	    Lotto3_fuc.grade(in_num,out_num,cor);
	}//mode 2
	
	else if(mode==3)
	{   int mode3_A=1;
		Lotto3_fuc.generate_nonDup(out_num);
		Lotto3_fuc.align(out_num);	
		
		while(one!=1) {
			Lotto3_fuc.generate_nonDup(in_num);
			Lotto3_fuc.align(in_num);
	    for(int i=0;i<in_num.length;i++)
	    {
	    	for(int j=0;j<i+1;j++)
	    	{
	    	if(in_num[i]==out_num[j]) 	    	
	    	cor++;  
	    	}
	    }
	    System.out.println(mode3_A+"��°�õ�");
	    System.out.println("��÷��ȣ��"+Arrays.toString(out_num)+"�Դϴ�.");
	    System.out.println("�Է¹�ȣ��"+Arrays.toString(in_num)+"�Դϴ�.");
        if(cor==6) {System.out.println("1���÷!!!!!!!!!"); cor-=6;one++;}
        else if(cor==5) cor-=5;
        else if(cor==4) cor-=4;
        else if(cor==3) cor-=3;
        else if(cor==2) cor-=2;
        else if(cor==1) cor-=1;        
        mode3_A++;
		}//mode3_while		
		System.out.println("���ݾ���"+mode3_A/100000+"����Դϴ�."); one--;
	}//mode 3
	else if (mode==0) {System.out.println("���α׷��� �����մϴ�.");break;}
	else System.out.println("�ùٸ����ڸ��Է����ּ���");	
   }//while	
	 	sc.close();
  } //main
}//class
