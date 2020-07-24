package Module2;

public class Fibonacci {

	public static void main(String[] args) {
		// generate 'n' fibonacci numbers
		//0,1,1,2,3,5,8,13,21,34,55
	int i,j,num;	
i=0;
j=1;

System.out.println("List of Fibonacci numbers:");
System.out.println(i);

System.out.println(j);

for(int n=1;n<10;n++)
{

	num=i+j;  
	System.out.println(num);
	i=j;
	j=num; 
	
}	
	

	}
}

