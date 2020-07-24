package Module5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


class employeerecords
{
	String employeeid;
	String employeename;
	String officedepartment;
	long empsalary;
	
	employeerecords(String empid, String empname,String department,long salary)
	{
	employeeid = empid;
	employeename = empname;
	officedepartment = department;
	empsalary = salary;
	}
}

public class hashmap {

	public static void main(String[] args) {
		// write 5 employee records using HashMap and display them
		
		employeerecords e1 = new employeerecords("emp001","John Smith","IT",150000);
		employeerecords e2 = new employeerecords("emp002","Brenda Kein","FINANCE",250000);
		employeerecords e3 = new employeerecords("emp003", "Clark Hope","HR",100000);
		employeerecords e4 = new employeerecords("emp004","Diane Garner","IT",200000);
		employeerecords e5 = new employeerecords("emp005","Julian Aniston","MARKETING",125000);
		
		
		HashMap hm = new HashMap();
		
		hm.put(1,e1);
		hm.put(2,e2);
		hm.put(3,e3);
		hm.put(4,e4);
		hm.put(5,e5);
		
		Iterator trav = hm.entrySet().iterator();
		
		while(trav.hasNext())
		{
			
		Map.Entry record = (Map.Entry)trav.next();
		employeerecords e=(employeerecords)record.getValue();
		System.out.print(record.getKey() + " ");
		System.out.println(e.employeeid +" "+ e.employeename+" "+e.officedepartment+" "+e.empsalary);
		}
	}

}
