package decorator;
//װ���·�
public class AngelEqClothes extends AngelEquip{

	public AngelEqClothes(Angel _angel) {
		super(_angel);
	}

	private void getClothes(){
		System.out.println("��������ʹ�·�.");
	}
	
	@Override
	void ReportMyEquip() {
		super.ReportMyEquip();
		this.getClothes();
	}
}
