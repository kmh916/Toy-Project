package pokemongame_;

import java.io.IOException;

public class View 
{  
	public static String[] name_town = {"��Ͻ�Ƽ","ȸ����Ƽ","����Ƽ","������Ƽ","��������Ƽ",
			"����ȫ��Ƽ","�����Ƽ","ȫ�ü�"};
	public static int mytown =0;
	public static int badge = 0;
	
	public static void view_town(String name_town) 
	{
		System.out.println("==============================================================");
		System.out.println("    \t\t"+name_town+"�� ���Ű��� ȯ���մϴ�!!");
		System.out.println("    1.����� 2.�� ���ϸ� 3.���ϸ��� 4.ü��������  5.���� �̵�  6.�����ϱ� 7.�ҷ����� ");
		System.out.println("==============================================================");
	}
	public static void view_dungeon(int level)
	{   int index=1;
		for (int i = level; i < level+9; i++) 
		{
		   System.out.println(index++ +". "+i+"���� ���� ���");	
		}
	}
	public static void view_mypok(Pokemon mypok)
	{
		System.out.println("�̸� : "+mypok.name_pok);
		System.out.println("����  : "+mypok.level);
		System.out.println("ü�� : "+mypok.hp+" / "+mypok.hp_max);
		System.out.println("��������ġ : "+mypok.exp_has);
		System.out.println("���緹�� �ִ� ����ġ : "+mypok.exp_max);
		System.out.println("�������  ");
		for(int i=0;i<4;i++)
		{   
			System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");
		}
		pause();
	}
	public static void view_pokemonCenter(Pokemon mypok) 
	{   Bgm pokcen = new Bgm("src/pokemongame_/bgm/pokemoncenter.mp3");
		pokcen.play();
		System.out.println("==================================");
		System.out.println("    ���ϸ��Ϳ� ���Ű��� ȯ���մϴ�!!     ");
		System.out.println("==================================");
		pause();
		System.out.println("���ϸ��� ȸ����ŵ�ϴ�.....");
		pokcen.close();
	    new Bgm("src/pokemongame_/bgm/heal.mp3").play();
		Fuction.sleep(3000);
		System.out.println("ȸ���Ϸ�!!");
		Fuction.sleep(1000);
		mypok.hp = mypok.hp_max;
	}
	public static void view_pokemonCenter2(Pokemon mypok) 
	{	Bgm pokcen = new Bgm("src/pokemongame_/bgm/pokemoncenter.mp3");
		pokcen.play();
		System.out.println("���ϸ��� �������� ���ϸ��ͷ� �̵��մϴ�.");
		pause();
		System.out.println("==================================");
		System.out.println("    ���ϸ��Ϳ� ���Ű��� ȯ���մϴ�!!     ");
		System.out.println("==================================");
		System.out.println("���ϸ��� ȸ����ŵ�ϴ�.....");
		pokcen.close();
	    new Bgm("src/pokemongame_/bgm/heal.mp3").play();
	    Fuction.sleep(3000);
		System.out.println("ȸ���Ϸ�!!");
		Fuction.sleep(1000);
		mypok.hp = mypok.hp_max;
	}
	
	public static void view_challenge(String name_town)
	{
		System.out.println(name_town+" ü������ �����մϴ�....");
		pause();
	}
	
	public static void view_moveTown()
	{
		for (int i = 0; i <8; i++) 
		{
		   System.out.println(i+1 +". "+name_town[i]+"�� �̵�");	
		}
	}
	
	public static void error()
	{System.out.println("�߸��Է��ϼ̽��ϴ�.");}
	
	public static void pause() 
	{try { System.in.read();} catch(IOException e) {}}

}

