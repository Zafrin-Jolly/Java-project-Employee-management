package classes;
import java.lang.*;
import interfaces.*;

public class ImportedProduct extends Product
{
	private String countryName;
	
	public void setCountryName(String countryName) {this.countryName=countryName;}
    public String getCountryName( ) {return countryName;}

    public  void showInfo( )
	{
		System.out.println("Product ID :"+pid  );
		System.out.println("Product Name :"+name  );
		System.out.println("Available Quantity :"+availableQuantity );
		System.out.println("Price :"+price  );
		System.out.println("Country :"+countryName  );
	}
}