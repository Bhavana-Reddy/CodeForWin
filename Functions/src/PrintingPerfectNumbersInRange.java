
public class PrintingPerfectNumbersInRange {
	public void PrintingPerfectNumbersInRange(int start, int end){
		for(int n = start;n<=end;n++) {
			int sum = 0;
			for(int i =1 ;i<n;i++) {
				if(n%i==0) {
					sum = sum+i;
				}
			}
			if(sum==n) {
				System.out.println(n);
			}
		}
		
	}
}
