package Module5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class studentrecords
{
	String studentid;
	String studentname;
	double score;
	
	studentrecords(String studid,String studname,double marks)
	{
		studentid = studid;
		studentname = studname;
		score = marks;
	}



}

public class CaseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentrecords s1 = new studentrecords("s001","Kayra Mehra",85.0);
		studentrecords s2 = new studentrecords("s002","Sara Lal",89.0);
		studentrecords s3 = new studentrecords("s003","Meher Lamba",75.0);
		studentrecords s4 = new studentrecords("s004","Richa Mishra",95.0);
		studentrecords s5 = new studentrecords("s005","Sarika Sood",98.0);
		
		HashMap<Integer,Object> h = new HashMap<Integer,Object>();
		
		h.put(1,s1);
		h.put(2,s2);
		h.put(3,s3);
		h.put(4,s4);
		h.put(5,s5);
		
		Iterator it1 = h.entrySet().iterator();
		System.out.println("Record of 5 students:");
		while(it1.hasNext())
		{
			Map.Entry entry = (Map.Entry)it1.next();
			System.out.print(entry.getKey() + " : ");
			studentrecords s=(studentrecords)entry.getValue();
			System.out.println(s.studentid + " , " + s.studentname + " , " + s.score);
		}
		
		//remove two records
		
		h.remove(2,s2);
		h.remove(4,s4);
		
		System.out.println("Record of 3 students as two of the students have left the school");
		Iterator it2 = h.entrySet().iterator();
		while(it2.hasNext())
		{
			Map.Entry entry = (Map.Entry)it2.next();
			System.out.print(entry.getKey() + " : ");
			studentrecords s=(studentrecords)entry.getValue();
			System.out.println(s.studentid + " , " + s.studentname + " , " + s.score);
		}
		
		//update student names having id 3 and 5
		
		
		
		System.out.println("Updated student record: Students with id "+ s3.studentid + " and "+ s5.studentid + "names has changed");
		
		
		Iterator it3 = h.entrySet().iterator();

		
		while(it3.hasNext())
		{
			Map.Entry entry = (Map.Entry)it3.next();
			studentrecords s=(studentrecords)entry.getValue();
			
			System.out.print(entry.getKey() + " : ");
			if(entry.getKey().equals(3))
			{
			s.studentname = "Mehek Lamba";
			//entry.setValue(s);
			
			
			}
			
			if(entry.getKey().equals(5))
			{
			//entry.setValue(s.studentname="Sarita Sood");
				s.studentname="Sarita Sood";
			}
			
			System.out.println(s.studentid + " , " + s.studentname + " , " + s.score);
		}
			
		//compare two student records
		
		Iterator it4 = h.entrySet().iterator();
		double maxscore = 0, secondmax=0;
		String studentname="",studentid="";
		while(it4.hasNext())
		{
			Map.Entry entry = (Map.Entry)it4.next();
			
			
			studentrecords s=(studentrecords)entry.getValue();
			//System.out.println(s.score);
			if(maxscore < s.score)
			{
				maxscore = s.score;
				studentname = s.studentname;
				studentid = s.studentid;
			}
			
		}
		System.out.println("Student with max score is: "+ studentid +" "+studentname+ " "+ maxscore);
		
		Iterator it5 = h.entrySet().iterator();
		String stid="",stname="";
		while(it5.hasNext())
		{
			Map.Entry entry = (Map.Entry)it5.next();
			
			
			studentrecords s=(studentrecords)entry.getValue();
			
			if(secondmax < s.score)
			{
				
				if(s.score != maxscore)
				{
				secondmax = s.score;
				
				stname = s.studentname;
				stid = s.studentid;
				}
			}
		}
		System.out.println("Student with second max score is: "+ stid +" "+stname+ " "+ secondmax);
	
	//sort students by name and id
	
	
	}

}
