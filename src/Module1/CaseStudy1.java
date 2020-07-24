package Module1;

public class CaseStudy1 {

	public static void main(String[] args) {
		//Billing Application of an Amusement park
		float ticketprice = 400;
		int numoftickets = 2;
		float totalprice = ticketprice * numoftickets;
		if(numoftickets>10)
		{
			float discount = numoftickets * ticketprice * 10/100;
			float discountedprice =  totalprice - discount;
			System.out.println("Total amount is: "+ "Rs."+discountedprice);
	
		}
		else
		{
			System.out.println("Total amount is: "+ "Rs."+totalprice);
		}

	}

}
