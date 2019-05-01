
public class HeartStarPattern {
	public void heartStarPattern(int input){
		for(int i=1;i<input;i++) {
			for(int j=input-i-2;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=input+2*(i-1);j>0;j--) {
				System.out.print("*");
			}
			for(int j=2*input-(2*i+3);j>0;j--) {
				System.out.print(" ");
			}
			if(i==input-1) {
				for(int j=input+2*(i-1)-3;j>0;j--) {
					System.out.print("*");
				  }
			}
			else {
			  for(int j=input+2*(i-1);j>0;j--) {
				System.out.print("*");
			  }
			}
			System.out.println();
		}
		
		
		
		for(int i=1;i<2*input;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=4*input-(2*i+1);j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
