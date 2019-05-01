
public class LeftArrowStarPattern {
	public void leftArrowStarPattern(int input){
		for(int i=1;i<=input;i++) {
			for(int j=i;j<input;j++) {
				System.out.print("  ");
			}
			for(int j=input-i+1;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=2;i<=input;i++) {
			for(int j=i-1;j>0;j--) {
				System.out.print("  ");
			}
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
