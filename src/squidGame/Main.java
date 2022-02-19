package squidGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void progress(String[][] arr_glass,int turn) {
		for (int i = 0; i < arr_glass.length; i++) {
			System.out.print("│");
			for (int j = 0; j < arr_glass[i].length; j++) {
				System.out.print("   "+arr_glass[i][j]+"   ");
			}
			
			System.out.print("│");
			if(i==turn+1) System.out.println("<-------현위치");
			else System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int index = 17;
			int turn = 17;
			int life = 16;
			boolean[][] arr_bool = new boolean[18][2];
			String[][] arr_glass = new String[18][2];
			for (int i = 0; i < arr_bool.length; i++) {
				arr_bool[i][0] = new Random().nextBoolean();
				arr_bool[i][1] = !arr_bool[i][0];
				for (int j = 0; j < arr_bool[i].length; j++) {
					arr_glass[i][j] = "□";
					//System.out.print(arr_bool[i][j]);
				}
				//System.out.println();
			}
		System.out.println("★☆★☆★☆★☆★☆오징어 게임 다리 건너기★☆★☆★☆★☆★☆");
		System.out.println("1.게임 시작 2.게임 방법");
		int ch = sc.nextInt();
		if(ch == 1) {
			while(true) {
			Main.progress(arr_glass,turn);
			System.out.println(17-life+"번 참가자 도전!");
			System.out.println("당신의 선택은?\n1.왼쪽 2.오른쪽");
			int ch2 = sc.nextInt();
			if(ch2==1||ch2==2) {
//				try {
//					System.out.println("점프중.....");
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				if(arr_bool[index][ch2-1]==true) {
				System.out.println("성공!");
				index--;
				turn--;
				}
				else {
					System.out.println("사망!"); 
					arr_glass[index][ch2-1] = " ";
					index = 17;
					turn = 17;
					life--;
				}
				
			}	
			else System.out.println("올바른 숫자를 입력해주세요");
			if(life==0) {
				System.out.println("게임 오버");
				break;
				}
			if(turn ==-1) {
				System.out.println("우승!!!!!!!!!!!");
				break;
			 }
			}
		}
		else if (ch ==2) System.out.println("오징어게임 보고 오세요");	
		else System.out.println("올바른 숫자를 입력해주세요");
		}
		
		
		
	}

}
