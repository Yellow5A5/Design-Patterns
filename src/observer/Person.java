package observer;

public class Person implements Observer{
	@Override
	public void update(String str) {
		if (str.equals("catCall")) {
			System.out.println("è�������ҳ����ˣ���");
		}
	}
}
