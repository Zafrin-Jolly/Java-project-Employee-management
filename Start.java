import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("______Welcome to our Market Management Application______");
		
		boolean repeat = true;
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
			System.out.println("___1. Employee Management");
			System.out.println("___2. Shop Management");
			System.out.println("___3. Shop Product Management");
			System.out.println("___4. Product Quantity Add-Sell");
			System.out.println("___5. Exit\n");

			System.out.print("Your Choice: ");
		  
		    try
		{	   
			int choice = sc.nextInt();
			
			switch(choice)
		    {
				case 1:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Employee Management");
					
					System.out.println("Choose any one Option from the followings :\n");
					System.out.println(" 1. Insert New Employee.  2.Get an Employee   3.Removing an Existing Employee  4. Show All Employees  5. Go Back\n");
					System.out.println();
					
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							m.insertEmployee(e1);
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Get An Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = m.getEmployee(empId2);
							
							if(e2 !=null)
							{
								System.out.println();
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
								System.out.println();
							}
							else { System.out.println("Employee Not Found");}
							
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Remove an Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = m.getEmployee(empId3);
							
							if(e3 != null)
							{
								m.removeEmployee(e3);
							}
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Show All Employees");
							m.showAllEmployees();
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("--------------------------------");
					break;
					//////////////////////////
					
				case 2:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Shop Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println(" 1. Insert New Shop   2.Remove Existing Shop   3.Show All Shops   4.Search a Shop   5.Go Back\n ");
					
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							System.out.print("Enter Shop Name: ");
							String name1 = sc.next();
							
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
						
							m.insertShop(s1);
							
							System.out.println("########################");
							break;
								
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove an Existing Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							
							Shop s2 = m.getShop(sid2);
							
							if(s2 != null)
							{
								m.removeShop(s2);
							}
							
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Shops");
							m.showAllShops( );
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Search a shop ");
							
							System.out.print("Enter Shop ID: ");
							String sid3 = sc.next();
							
							Shop s3 = m.getShop(sid3);
							
							if(s3 !=null)
							{
								System.out.println();
								System.out.println("Shop ID: "+s3.getSid());
								System.out.println("Shop Name: "+s3.getName());
								s3.showAllProducts();
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("--------------------------------");
					break;
					///////////////
					
				case 3:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Shop Product Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println(" 1.Insert New Product    2.Remove Existing Product    3.Search a Product   4. Show All Product   5. Go Back\n");
					
					
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Product\n");
							
							Product p = null;
							
							System.out.println("Which type of Product?\n");
							System.out.println("	1. Imported Product");
							System.out.println("	2. Local Product");
							System.out.println("	3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								ImportedProduct ip = new ImportedProduct();
								
								System.out.print("Product ID: ");
                                String pid1 = sc.next();
								System.out.print("Product Name: ");
								String pn1 = sc.next();
								System.out.print("Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Price: ");
								int pp1 = sc.nextInt();
								System.out.print("Country Name: ");
								String cn1 = sc.next();
								
								ip.setPid(pid1);
								ip.setName(pn1);
								ip.setAvailableQuantity(aq1);
								ip.setPrice(pp1);								
								ip.setCountryName(cn1);								
								
								p=ip;
														
							}
							else if(type == 2)
							{
								LocalProduct lp= new LocalProduct();
								
								System.out.print("Product ID: ");
                                String pid1 = sc.next();
								System.out.print("Product Name: ");
								String pn1 = sc.next();                             
								System.out.print("Available Quantity: ");
								int aq1  = sc.nextInt();
								System.out.print("Product Price: ");
								int pp1 = sc.nextInt();
								System.out.print("Discount Rate: ");
								double dr1 = sc.nextDouble();
								
								
								
								lp.setPid(pid1);
								lp.setName(pn1);
								lp.setAvailableQuantity(aq1);
								lp.setPrice(pp1);							
								lp.setDiscountRate(dr1);
							
								p = lp;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(p != null)
							{
								System.out.print("Enter Shop ID: ");
								String sid1 = sc.next();
								
								m.getShop(sid1).insertProduct(p);
								
							}
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Remove Existing product");
							
							System.out.print("Enter Product ID: ");
							String pid2 = sc.next();
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							
							m.getShop(sid2).removeProduct(m.getShop(sid2).getProduct(pid2));
			
							System.out.println("#####################");
							break;
							
						case 3:
						
							System.out.println("#####################");
							System.out.println("Search A Product ");
							
							System.out.print("Enter Product ID: ");
							String pid3 = sc.next();
							System.out.print("Enter Shop ID: ");
							String sid3 = sc.next();
							
							
							Product pp = m.getShop(sid3).getProduct(pid3);

							if(pp != null)
							{
								pp.showInfo();
							}
							
							System.out.println("#####################");
							break;
						
						case 4: 
						
							System.out.println("#####################");
							System.out.println("Show All Product");
							System.out.print("Enter Shop ID: ");
							String sid4 = sc.next();
							
							m.getShop(sid4).showAllProducts();
							
							System.out.println("#####################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back..");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					////////////
				case 4:
				
					System.out.println("---------------------------------");
					System.out.println("Product Quantity Add-Sell");
					System.out.println("What do you want to do?\n");
					
					System.out.println("1.Add Product   2.Sell Product   3.Show Add Sell History    4.Go Back");
					
					
					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();

					switch(input4)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Add Product\n");

							System.out.print("Enter Product Id: ");
							String pid1 = sc.next();							
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							System.out.print("Enter Add Quantity: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								m.getShop(sid1).getProduct(pid1).addQuantity(amount1);

								frwd.writeInFile("Quantity Added: "+ amount1+"  Product :"+m.getShop(sid1).getProduct(pid1).getName()+"  Id :"+ pid1+"  Shop: "+m.getShop(sid1).getName());
							}
							else
							{
								System.out.println("INVALID AMOUNT");
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Sell Product");
							
							System.out.print("Enter Product ID: ");
							String pid2 = sc.next();
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							System.out.print("Enter Sell Quantity: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2 <= m.getShop(sid2).getProduct(pid2).getAvailableQuantity())
							{
								m.getShop(sid2).getProduct(pid2).sellQuantity(amount2);

								frwd.writeInFile("Sold Quantity: "+ amount2+"  Product :"+m.getShop(sid2).getProduct(pid2).getName()+"  Id :"+ pid2+"   Shop : "+m.getShop(sid2).getName());
							}
							else
							{
								System.out.println("INVALID AMOUNT");
							}
							
							System.out.println("#####################");
							break;

						case 3:
						
							System.out.println("#####################");
							System.out.println("Show Add Sell History");
							frwd.readFromFile();
							
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Going Back..");
							System.out.println("#####################");
							break;
							
						default:
						
							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
					}
					
					System.out.println("-----------------------------------");
					break;
					//////////////
								
				case 5:
				
					System.out.println("********************");
					System.out.println("Exit");
					repeat = false;
					System.out.println("********************");
					break;
					
				default:
				
					System.out.println("********************");
					System.out.println("Invalid Option");
					System.out.println("********************");
					
					
			}
			
		} 
            catch(InputMismatchException ime)
			{
				System.out.println("InputMismatchException occured");
				System.out.println("Please Enter Proper Input");
				String a = sc.next();
			}
			catch(NullPointerException npe)
			{
				System.out.println("NullPointerException occured");		
                System.out.println("Your input information does not exist");
				
			}
			catch(Exception e)
			{
				System.out.println("Exception occured ");
				e.printStackTrace();
				String a = sc.next();
				
			}
			
		}	
	}
	
}