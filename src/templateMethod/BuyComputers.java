package templateMethod;

public class BuyComputers extends ShoppingOnline{

	@Override
	public void getWebsite() {
		System.out.println("�����̳�");
	}

	@Override
	public void getTheNeed() {
		System.out.println("����ʼǱ�����е����...");
	}

	@Override
	public void pay() {
		System.out.println("΢��֧��");
	}

}
