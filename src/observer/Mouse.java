package observer;

public class Mouse implements Observer{

	@Override
	public void update(String str) {
		if (str.equals("catCall")) {
			System.out.println("����è�У�è���ˣ�����!!");
		}else if (str.equals("catSleep")) {
			System.out.println("��˯�����Ͻ��Ҷ�����!!");
		}
	}
}
