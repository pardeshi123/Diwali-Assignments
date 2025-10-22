import java.util.Scanner;

public class CodingCHallenge_FindMissingNumberFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the array length: ");
		   int n = sc.nextInt();
		   int[] arr = new int[n];
		    System.out.println("Enter the array elements: ");
		   for(int i=0;i<n; i++) {
			   arr[i]=sc.nextInt();
		   }
	            
	        
	        int SumOfnNo = n * (n + 1) / 2;
	        
	        int SumOfArrEle = 0;
	        for (int num : arr) {
	        	SumOfArrEle += num;
	        }

	        int MissNo = SumOfnNo - SumOfArrEle;
	        if(MissNo<0) {
	        	MissNo=-MissNo;
	        }

	        System.out.println("The missing number is: " + MissNo);

	}

}
