package classes;
import java.lang.*;
import interfaces.*;

public class LocalProduct extends Product
{
	private double discountRate;
	
    public void setDiscountRate(double discountRate) { this.discountRate=discountRate;}
    public double getDiscountRate( ) {return discountRate;}
	
	public  void showInfo( )
	{
		System.out.println("Product ID :"+pid  );
		System.out.println("Product Name :"+name  );
		System.out.println("Available Quantity :"+availableQuantity );
		System.out.println("Price :"+price  );
		System.out.println("Discount Rate :"+discountRate  );
	}
}