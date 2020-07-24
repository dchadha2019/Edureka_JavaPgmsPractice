package Module5;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		// write 5 student records into hashtable and display the student with the highest marks
		Hashtable<String,Double> hash = new Hashtable<String,Double>();
		
		hash.put("John",99.98);
		hash.put("Peter",95.50);
		hash.put("Tom", 100.00);
		hash.put("Victoria",96.65);
		hash.put("Susan",99.99);
		
		Enumeration<String> names;
		
		names = hash.keys();
		
		double maxscore=0 ;
		String strkey, studname="";
		
		while(names.hasMoreElements())
		{
			strkey=(String)names.nextElement();
			
			
			if(maxscore < hash.get(strkey) )
			{
				maxscore = hash.get(strkey);
				studname = strkey;
				
			}
			
		}
		System.out.print("The student with the highest score is: " + studname);
		System.out.println(" with score: " + maxscore);

	}

}
