package templateMethod;

public class BuyBooks extends ShoppingOnline{

	@Override
	public void getWebsite() {
		System.out.println("������");
	}

	@Override
	public void getTheNeed() {
		System.out.println("Java���˼�롢java�����...");
	}

	@Override
	public void pay() {
		System.out.println("֧��������");
	}

}
