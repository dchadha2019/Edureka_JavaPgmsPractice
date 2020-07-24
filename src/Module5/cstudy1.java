package Module5;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class cstudy1 {

	
	private static HashMap sortByValues(HashMap map)
	{
		List list = new LinkedList(map.entrySet());
		
		Collections.sort(list,new Comparator(){
		public int compare(Object o1, Object o2){
			return((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
		}});
		
			
		
		HashMap sortedHashMap = new LinkedHashMap();
		for(Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry)it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
		}
	
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//Add name and id of 5 students
		
		
		hm.put(3,"Pia Hudson");
		hm.put(4,"Alice Smith");
		hm.put(5,"Sarah Keith");
		hm.put(2,"Sandra Parker");
		hm.put(1,"Zohra Aniston");
		
		Iterator it1 = hm.entrySet().iterator();
		System.out.println("Name and ID of all 5 students: \n");
		while(it1.hasNext())
		{
			Map.Entry m = (Map.Entry)it1.next();
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		//delete 2 student records
		
		hm.remove(2);
		hm.remove(4);
		
		
		Iterator it2 = hm.entrySet().iterator();
		System.out.println("");
		System.out.println("Name and ID of the remaining 3 students after removing 2 students from the list: \n");
		while(it2.hasNext())
		{
			Map.Entry m = (Map.Entry)it2.next();
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		
		//modify the names of students having id 3 and 5
		
		hm.replace(3,"Pia Hudson","Priya Hudson");
		hm.replace(5,"Sarah Keith","Sara Keith");
		
		Iterator it3 = hm.entrySet().iterator();
		System.out.println("");
		System.out.println("Changed names of students having ID - 3 and 5: \n");
		while(it3.hasNext())
		{
			Map.Entry m = (Map.Entry)it3.next();
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		//compare two student records
		//sort students by name and id
		
		//Sort students by id
		Iterator it4 = hm.entrySet().iterator();
		System.out.println("");
		System.out.println("Sorted list of students by ID: \n");
		while(it4.hasNext())
		{
			Map.Entry record = (Map.Entry)it4.next();
			System.out.println(record.getKey() + " - " + record.getValue());
		}
		
		//sort students by name
		
		Map<Integer,String> map = sortByValues(hm);
		
		Iterator it5 = map.entrySet().iterator();
		System.out.println("");
		System.out.println("Sorted list of students by Name: \n");
		while(it5.hasNext())
		{
			Map.Entry record = (Map.Entry)it5.next();
			System.out.println(record.getKey() + " - " + record.getValue());
		}
		
		
		
		
		
		
		
		
	}

}
