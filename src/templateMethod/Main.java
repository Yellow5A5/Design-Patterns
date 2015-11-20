package templateMethod;

public class Main {
	public static void main(String[] args) {
		ShoppingOnline buyBooks = new BuyBooks();
		ShoppingOnline buyCompu = new BuyComputers();
		buyBooks.shoppingProcedure();
		System.out.println("--------------------");
		buyCompu.shoppingProcedure();
	}
}
