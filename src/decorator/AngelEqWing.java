package decorator;
//װ�γ��
public class AngelEqWing extends AngelEquip{
	
	public AngelEqWing(Angel _angel) {
		super(_angel);
	}

	private void getWing(){
		System.out.println("��װ���˳��.");
	}
	
	@Override
	void ReportMyEquip() {
		super.ReportMyEquip();
		this.getWing();
	}
}
