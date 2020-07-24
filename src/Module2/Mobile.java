package Module2;

import java.util.Scanner;

public class Mobile {

	long dial()
	{
		long mobnum;
	System.out.println("Enter the mobile number you want to dial:");
	Scanner sc = new Scanner(System.in);
	mobnum=sc.nextLong();
	return mobnum;
	}
	
	long receivecall()
	{
		System.out.println("Enter the mobile number received call from: ");
		Scanner sc = new Scanner(System.in);
		long mobilenum=sc.nextLong();
		return mobilenum;
	}
	
	String textmessage()
	{
		String msg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text message\n");
		msg=sc.nextLine();
		return msg;
		
	}
static void display(long dialednum,long receivednum,String message)
{
	System.out.println("You have recently dialed: "+dialednum);
	System.out.println("You have recently received call from: "+receivednum);
	System.out.println("Your last text message was: "+message);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long mobilenum1, mobilenum2;
	
	Mobile m=new Mobile();
	
	mobilenum1=m.dial();
	
	mobilenum2=m.receivecall();
		
	String textmsg;
	
	textmsg=m.textmessage();
		
	m.display(mobilenum1,mobilenum2,textmsg);	
	}

}
