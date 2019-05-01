
public class XStarPattern {
	public void xStarPattern(int input){
		for(int i=1;i<=input;i++) {
			for(int j=i-1;j>0;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=2*input-(2*i+1);j>0;j--) {
				System.out.print(" ");
			}
			if(i<input) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<input;i++) {
			for(int j=input-i-1;j>0;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=2*i-1;j>0;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
