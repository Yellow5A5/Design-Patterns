package decorator;
//装饰武器
public class AngelEqWeapon extends AngelEquip{
	
	public AngelEqWeapon(Angel _angel) {
		super(_angel);
	}

	private void getWeapon(){
		System.out.println("我装上了武器.");
	}
	
	@Override
	void ReportMyEquip() {
		super.ReportMyEquip();
		this.getWeapon();
	}

}
