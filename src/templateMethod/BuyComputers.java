package templateMethod;

public class BuyComputers extends ShoppingOnline{

	@Override
	public void getWebsite() {
		System.out.println("京东商城");
	}

	@Override
	public void getTheNeed() {
		System.out.println("联想笔记本、机械键盘...");
	}

	@Override
	public void pay() {
		System.out.println("微信支付");
	}

}
