package templateMethod;

//���Ϲ���-����ģ����
public abstract class ShoppingOnline {
	//��ָ������վ
	public abstract void getWebsite();
	//������Ҫ����Ʒ
	public abstract void getTheNeed();
	//���ϸ�Ǯ
	public abstract void pay();
	
	//��������ģ��
	public void shoppingProcedure(){
		this.getWebsite();
		this.getTheNeed();
		this.pay();
	}
}
