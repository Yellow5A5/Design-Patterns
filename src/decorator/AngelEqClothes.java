package decorator;
//装饰衣服
public class AngelEqClothes extends AngelEquip{

	public AngelEqClothes(Angel _angel) {
		super(_angel);
	}

	private void getClothes(){
		System.out.println("穿上了天使衣服.");
	}
	
	@Override
	void ReportMyEquip() {
		super.ReportMyEquip();
		this.getClothes();
	}
}
