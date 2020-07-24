package Module5;

/*Byte			byte
Short			short								
Int				Integer
Long			long
Float			float
Double			double
Character		char
Boolean			boolean*/

public class Wrapper {

	public static void main(String[] args) {
		// wrapper classes
		
		int i = 10;
		
		Integer iobject = new Integer(i);
		System.out.println(iobject);
		
		
		
		short s = 1;
		Short sobj = new Short(s);
		
		System.out.println(sobj.shortValue());
		
		long l1 = 10000;
		Long lobj1 = new Long(l1);
		System.out.println(lobj1.longValue());
		
		long l2 = 20000;
		
		Long lobj2 = new Long(l2);
		if(lobj1.compareTo(lobj2) < 0)
		{
			System.out.println(lobj1 + " is lesser than " + lobj2);
		}

		float score1 = 90.50f;
		float score2 = 95.50f;
		
		Float flobj = new Float(0);
		
		
		System.out.println("The average of both scores is " + flobj.sum(score1, score2) / 2);
		
		
		double sal1 = 150000;
		double sal2 = 200000;
		
		Double dobj = new Double(0);
		
		System.out.println(dobj.max(sal1,sal2));
		
		char c = 'A';
		Character cobj = new Character(c);
		
		System.out.println(cobj.toLowerCase(c));
		
		boolean choice = true;
		Boolean b = new Boolean(choice);
		String str = b.toString();
		System.out.println(str);
		
	}

}
