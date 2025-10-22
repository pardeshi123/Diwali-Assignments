import java.util.Scanner;

public class Que4_SumOfDigitsOfNum {

	public static void main(String[] args) {
		System.out.println("------Sum OF digits of the numbers-----");
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		int rem=0;
		
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		
		System.out.println("Sum of all digits of numbers is: "+sum);
	}
	}

}
