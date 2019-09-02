import java.util.Scanner;

public class EndingZerosinFact {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int n = s.nextInt();
		int zeroCount=0;
		int i=1;
		while(n>=Math.pow(5, i)) {
		  int m=(int) (n/Math.pow(5, i));	
		  i++;
		  zeroCount= zeroCount+m;
	}
		System.out.println("the count of zeros is -"+zeroCount);
	}
}
