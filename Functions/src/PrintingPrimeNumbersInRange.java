
public class PrintingPrimeNumbersInRange {
	public void printingPrimeNumbersInRange(int start, int end) {
		
		for(int n = start; n<=end; n++) {
			int count =0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(n);
			}
		}
	}
}
