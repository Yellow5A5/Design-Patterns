package templateMethod;

//网上购物-抽象模板类
public abstract class ShoppingOnline {
	//上指定的网站
	public abstract void getWebsite();
	//订购需要的商品
	public abstract void getTheNeed();
	//网上付钱
	public abstract void pay();
	
	//购物流程模板
	public void shoppingProcedure(){
		this.getWebsite();
		this.getTheNeed();
		this.pay();
	}
}
