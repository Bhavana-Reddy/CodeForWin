import java.util.HashSet;
import java.util.Scanner;

public class HashingSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n value -");
		int n =s.nextInt();
		int arr[] = new int [n];
		System.out.println("enter the values in array -");
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt(); 
		}
		System.out.println("enter the sum value -");
		int sum = s.nextInt();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
	       for(int i=0;i<arr.length;i++) {
	    	   int temp = sum - arr[i];
	       
		    if(hs.contains(temp)) {
		    	System.out.println("the pair is - "+temp+" "+arr[i]);
		    }
		    hs.add(arr[i]);
	       }

	}

}
