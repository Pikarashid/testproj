import java.util.Arrays;

/**
 
/**
 * This class test Java Arrays
 * @author User
 *
 */

public class TestMultiArrays {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salaries [] = {2222,100,50,60,170,80,1,5,10};
		//Arrays.sort(salaries);
		Arrays.binarySearch(salaries, 1);
		System.out.println(Arrays.binarySearch(salaries,1));
		
		/*
		for(int i=0;i < salaries.length; i++) { //parameter
			System.out.println("Salary of "+i + " is " + salaries[i]);
		}
		*/
		//int i=0;
		for (int sal:salaries) {
			System.out.println(sal + ",");
			//i++;
		}

	}

}
