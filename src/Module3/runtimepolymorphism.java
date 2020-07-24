package Module3;

class car
{
	void display()
	{
	System.out.println("This is a car");
	}
}

class merc extends car
{
	void display()
	{
		System.out.println("This is Mercedes car");
	}
	
}
class bmw extends car
{
	void display()
	{
		System.out.println("This is bmw car");
	}
	
}
public class runtimepolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merc m=new merc();
		m.display();

		bmw b=new bmw();
		b.display();
		
	}

}
