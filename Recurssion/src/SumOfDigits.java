
public class SumOfDigits {
	public int sumOfDigits(int n) {
		int sum=0;
		int r;
		if(n>0) {
			r = n%10;
			sum = sum+r;
			System.out.println("the sum is :"+sum);
			n=n/10;
		}
		return sum;
	}

}
