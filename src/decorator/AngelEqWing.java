package decorator;
//装饰翅膀
public class AngelEqWing extends AngelEquip{
	
	public AngelEqWing(Angel _angel) {
		super(_angel);
	}

	private void getWing(){
		System.out.println("我装上了翅膀.");
	}
	
	@Override
	void ReportMyEquip() {
		super.ReportMyEquip();
		this.getWing();
	}
}
