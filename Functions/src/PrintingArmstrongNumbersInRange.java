
public class PrintingArmstrongNumbersInRange {
	public void printingArmstrongNumbersInRange(int start, int end){
		for(int n=start;n<=end;n++) {
			int r=0;
			int c=0;
			int sum=0;
			int temp =n;
		  while(n>0) {
			  r = n%10;
			  c = r*r*r;
			  sum = sum+c;
			  n = n/10;
		  }
//		  System.out.println("the value of n is :"+n);
//		  System.out.println("the value of sum is :"+sum);

		  n = temp;
		  if(sum==n) {
			  	System.out.println(n);
		  }
		}
		
	}

}
