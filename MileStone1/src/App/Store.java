package App;

public class Store {
	private int cartInv;
	private int cartTotal;
	private String storeSection;
	
	public Store(int cartInv, int cartTotal, String storeSection)
	{
		this.cartInv = cartInv;
		this.cartTotal = cartTotal;
		this.storeSection = storeSection;
	}
	
	public int getcartInv()
	{
		return cartInv;
	}
	public int getcartTotal()
	{
		return cartTotal;
	}
	public String getstoreSection()
	{
		return storeSection;
	}
	
	public void finShopping()
	{
		System.out.println("User is ready to purchase the items.");
	}
	public void payComp()
	{
		System.out.println("The user has selected a method of pay and has completed their purchase");
	}
	public void cancelPay()
	{
		System.out.println("The user has canceled their payment. Refund if necessary.");
	}
	
	public static void main(String[] args)
	{
		Store store = new Store(2, 100, "Clothing");
		System.out.println("The user has selected " + store.getcartInv() + " items from the " +
		store.getstoreSection() + " and have decide to purchase the items for a total of " + store.getcartTotal() + " US Dollars.");
		
		store.finShopping();
		store.payComp();
		store.cancelPay();
	}
}
