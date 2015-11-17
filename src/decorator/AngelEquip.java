package decorator;

public abstract class AngelEquip extends Angel{

	private Angel angel;
	
	public AngelEquip(Angel _angel) {
		this.angel = _angel;
	}
	
	@Override
	void ReportMyEquip() {
		this.angel.ReportMyEquip();
	}

}
