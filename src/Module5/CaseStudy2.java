package Module5;

import java.util.ArrayList;
import java.util.Collections;

public class CaseStudy2 {

	public static void main(String[] args) {
		// ArrayList
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("USA");
		list.add("India");
		list.add("Canada");
		list.add("UK");
		list.add("Australia");
		list.add("China");
		list.add("Russia");
		list.add("Japan");
		
		System.out.println("List of countries displayed in the same order as inserted:\n");
		for(String str1:list)
		System.out.println("-"+str1);
		
		//sorted list
		Collections.sort(list);
		System.out.println("List of countries displayed in sorted order:\n");
		for(String str2:list)
			System.out.println("-"+ str2);
		
		
	}

}
