
public class ReverseOfNumberRecurssion {
	public int ReverseOfNumberRecurssion(int sum, int n){
		
		int r ;
		if(n!=0) {
			r = n%10;
			System.out.println("the value of r before :"+r);
			sum = sum*10+r;
			System.out.println("the sum value is :"+sum);
			ReverseOfNumberRecurssion(sum, n/10);
		}else {
			return sum;
		}
		return sum;
	}

}
