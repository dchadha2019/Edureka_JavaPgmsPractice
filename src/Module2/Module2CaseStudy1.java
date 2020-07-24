package Module2;

import java.util.Scanner;

public class Module2CaseStudy1 {

	public static void main(String[] args)
	{
	String 	drinksmenu[]={"coke         ","sprite        ","orange juice  ","strawberry soda","chocolate shake"};
	float drinksprice[]={2.00f,2.00f,3.50f,2.50f,4.00f};
	
	float totalprice=0f;
	
	System.out.println("***Menu***");
	System.out.print("Drinks");
	System.out.print("            ");
	System.out.println("Price");
	
	for(int p=0;p<5;p++)
	{
		System.out.print(drinksmenu[p]);
		System.out.print("     ");
		System.out.println("$"+drinksprice[p]);
	}
	
	System.out.println("Please enter your order from the menu:");
	
	Scanner sc = new Scanner(System.in);
	
	int drinksquantity[]=new int[20];
	
	String drinkname[]=new String[5];
	
	String orderstatus="yes";
	
	int n=1,count=0;
	
	while(orderstatus.equalsIgnoreCase("yes"))
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Which drink?");
			
			drinkname[i]=sc.nextLine();
			
			System.out.println("how many?");
			
			drinksquantity[i]=sc.nextInt();
			sc.nextLine();
			
			
			System.out.println("Anything else?");
			
			orderstatus=sc.next();
			sc.nextLine();
			count++;
			
			if(orderstatus.equalsIgnoreCase("No"))
			{
				break;
			}
			n++;
		}
		if(orderstatus.equalsIgnoreCase("no"))
		{
			break;
			
		}
	}
	for(int j=0;j<count;j++)
	{
		for(int k=0;k<drinksmenu.length;k++) 
		{
			if(drinkname[j].equalsIgnoreCase(drinksmenu[k].trim()))
			{
				
				totalprice = totalprice + drinksquantity[j] * drinksprice[k];
		
				
			}
			if(drinkname[j]==null)
			{
				break;
			}
		}
	if(drinkname[j]==null)
	{
		break;
	}
	}
			System.out.println("Your total is: $"+totalprice);
			
	sc.close();
	
			}
			
	

	}



