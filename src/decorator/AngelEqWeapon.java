package decorator;
//װ������
public class AngelEqWeapon extends AngelEquip{
	
	public AngelEqWeapon(Angel _angel) {
		super(_angel);
	}

	private void getWeapon(){
		System.out.println("��װ��������.");
	}
	
	@Override
	void ReportMyEquip() {
		super.ReportMyEquip();
		this.getWeapon();
	}

}
