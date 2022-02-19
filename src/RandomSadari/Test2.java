package RandomSadari;

public class Test2 
{

	public static void main(String[] args) 
	{   //A~F 출력하기
	    for (int i = 65; i <= 70; i++) {
			System.out.println((char)i);
		}
	  //AbCdE..xYz 출력하기   26
	    for (int i = 0; i < 26; i++) 
	    {   if(i%2==0) System.out.print((char)(i+65));
	        else  System.out.print((char)(i+97));
		}

	}

}
