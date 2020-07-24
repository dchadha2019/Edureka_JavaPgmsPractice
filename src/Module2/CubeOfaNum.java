package Module2;

public class CubeOfaNum {
	
	static int cube(int num)
	{
		int cube;
		cube=num*num*num;
		return cube;
	}

	public static void main(String[] args) {
		// Find the cube of a number
		int number=2;
		int cubenum;
		cubenum=CubeOfaNum.cube(number);
		System.out.println("The cube of "+number+" is: "+cubenum);
		

	}

}
