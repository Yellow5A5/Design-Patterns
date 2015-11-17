package observer;

public class Mouse implements Observer{

	@Override
	public void update(String str) {
		if (str.equals("catCall")) {
			System.out.println("听到猫叫，猫醒了！快跑!!");
		}else if (str.equals("catSleep")) {
			System.out.println("在睡觉，赶紧找东西吃!!");
		}
	}
}
