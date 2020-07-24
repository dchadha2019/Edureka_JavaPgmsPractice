package Module1;

public class CaseStudy2 {

	public static void main(String[] args) {
		//Theater movie tickets booking 
		float silverticketprice = 150;
		float goldenticketprice = 200;
		int numofsilvertickets = 2;
		int numofgoldentickets = 2;
		float totalprice;
		if(numofsilvertickets >0 && numofgoldentickets == 0)
		{
			totalprice = silverticketprice * numofsilvertickets;
			System.out.println("The total price is: "+ "Rs."+totalprice);
		}
		if(numofsilvertickets ==0 && numofgoldentickets > 0)
		{
			totalprice = goldenticketprice * numofgoldentickets;
			System.out.println("The total price is: "+ "Rs."+totalprice);
		}
		if(numofsilvertickets >0 && numofgoldentickets > 0)
		{
			totalprice = silverticketprice * numofsilvertickets + goldenticketprice * numofgoldentickets;
			System.out.println("The total price is: "+ "Rs."+totalprice);
		}
		
	}

}
