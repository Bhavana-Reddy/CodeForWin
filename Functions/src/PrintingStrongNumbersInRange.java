
public class PrintingStrongNumbersInRange {
	public void printingStrongNumbersInRange(int start, int end){
		
		for(int n = start; n<=end; n++) {
			int sum =0;
			int fact =0;
			int r=0;
			int temp =n;
			while(n>0) {
				r = n%10;
				fact = fact(r);
				sum = sum+fact;
				n = n/10;
			}
			n = temp;
			if(sum==n) {
				System.out.println(n);
			}
			
		}
		
	}
	public int fact(int n) {
		int fact =1;
		for(int i =1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}

}
