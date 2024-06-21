package App;

public class Product {
	private String itemName;
	private int priceTag;
	private int invAmount;
	private String itemCategory;
	
	public Product(String itemName, int priceTag, int invAmount, String itemCategory)
	{
		this.itemName = itemName;
		this.priceTag = priceTag;
		this.invAmount = invAmount;
		this.itemCategory = itemCategory;
	}
	
	public String getitemName()
	{
		return itemName;
	}
	public int getpriceTag()
	{
		return priceTag;
	}
	public int getinvAmount()
	{
		return invAmount;
	}
	public String getitemCategory()
	{
		return itemCategory;
	}
	
	public void selectItem()
	{
		System.out.println("This item is a  " + itemName + " and is priced at " + priceTag + " Dollars.");
	}
	public void cartAdd()
	{
		System.out.println("Added item to your cart, there are " + invAmount + " left in the store " + itemCategory + " inventory.");
	}
	
	public static void main(String[] args)
	{
		Product product = new Product("Large Shirt With The Spoon Logo", 44, 52, "Clothing");
		System.out.println("The user has selected the " + product.getitemName() + " and is presented with the price of " + 
		product.getpriceTag() + " US Dollars and subtract 1 from the inventory of " + product.getitemCategory() + " with the inventory of " + 
		product.getinvAmount() );
		
		product.selectItem(); 
		product.cartAdd();
			}
}
