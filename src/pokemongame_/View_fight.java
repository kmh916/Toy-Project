package pokemongame_;

public class View_fight 
{
	public static void fightmain(Pokemon mypok, Pokemon pok)
	{
		System.out.println("    \t\t\t"+pok.name_pok);
		System.out.println("\t\t\t"+pok.hp+"  /  "+pok.hp_max);
		System.out.println(" ������������\t���������������� ���ߡ�\r\n" + 
				"������������ �������������������� �������ޥ��ޣ�\r\n" + 
				"������������ ���������������������� ��/ �ĢҪĢ�\r\n" + 
				"�������������������������� �� �� �� ������������\r\n" + 
				"���������� ������������ �� �� �� �� |) �ۡ��ۡ��� ��(|\r\n" + 
				"������������������������ ������ ���� ��������.�� �� ��\r\n" + 
				"��������������������(��((��(( �����ߣߣߣߣߣߣߣߣߣߡ�\r\n" + 
				"\t\t\t�� ���ߡ��ߣߣ��ߣ� ��\r\n" +
				mypok.name_pok+"\n"+
				mypok.hp+"  /  "+mypok.hp_max+"\n"+
				"������       ^��^\r\n" + 
				"--=�� ��(��.��.)\r\n" + 
				"-=�ա���/�� ��_��\r\n" + 
				"-=�ա��� �ѡ� Y\r\n" + 
				"������ �졬��\r\n");
		
	}
}
