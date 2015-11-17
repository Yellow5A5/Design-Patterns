package decorator;

public class Main {
	public static void main(String[] args) {
		Angel angel = new AngelGirl();
		angel = new AngelEqWing(angel);
		angel = new AngelEqClothes(angel);
		angel = new AngelEqWeapon(angel);
		angel.ReportMyEquip();
		
		System.out.println("------");
		//��һ��д����������һ���ġ�
		Angel angel2 = new AngelEqWeapon(new AngelEqClothes(new AngelEqWing(new AngelGirl())));
		angel2.ReportMyEquip();
		
		
	}
}
