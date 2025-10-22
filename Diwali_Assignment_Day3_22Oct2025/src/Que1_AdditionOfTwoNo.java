import java.util.Scanner;

public class Que1_AdditionOfTwoNo {

	public static void main(String [] args) {
		System.out.println("Addition Of Two Numbers");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int firstNo=sc.nextInt();
		System.out.println("Enter the Second number: ");
		int SecondNo=sc.nextInt();
		int add=firstNo+SecondNo;
		System.out.println("Addition of "+firstNo+ " and" +SecondNo+ " is: "+add);
	    sc.close();
	}
	
}
