package templateMethod;

public class BuyBooks extends ShoppingOnline{

	@Override
	public void getWebsite() {
		System.out.println("当当网");
	}

	@Override
	public void getTheNeed() {
		System.out.println("Java编程思想、java虚拟机...");
	}

	@Override
	public void pay() {
		System.out.println("支付宝付款");
	}

}
