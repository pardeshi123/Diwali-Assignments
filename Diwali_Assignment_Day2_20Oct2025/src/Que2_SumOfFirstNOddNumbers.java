import java.util.Scanner;

public class Que2_SumOfFirstNOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=1;
		for(int i=2;i<=n;i++) {
			if(i%2!=0) {
			sum=sum+i;
			
			}
		}
		sc.close();
		System.out.println("Sum of All Odd numbers till "+n+" is:"+sum);
	}

}
