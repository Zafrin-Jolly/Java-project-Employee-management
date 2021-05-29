package classes;
import java.lang.*;
import interfaces.*;

public class Shop implements ProductOperations
{
	private String sid;
    private String name;
    private Product products[] = new Product [100];
	
	public void setName(String name) {this.name=name;}
    public void setSid(String sid)   {this.sid=sid  ;}
	
    public String getName( )  {return name;}
    public String getSid( )      {return sid;}
	
	public void insertProduct(Product p)
	{
	 	int flag = 0;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Product Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
    public void removeProduct(Product p)
	{
		int flag = 0;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Product Removed");}
		else{System.out.println("Can Not Remove");}
	}
	
	
    public Product getProduct(String pid)
	{
		Product p = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getPid().equals(pid))
				{
					p = products[i];
					break;
				}
			}
		}
		return p;
	}
	
	
    public void showAllProducts( )
	{
		for(Product p : products)
		{
			if(p != null)
			{
				p.showInfo();
			}
		}
	}

}