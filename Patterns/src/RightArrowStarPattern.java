
public class RightArrowStarPattern {
	public void rightArrowStarPattern(int input){
		for(int i=0;i<input;i++) {
			for(int j=i;j>0;j--) {
				System.out.print("  ");
			}
			for(int j=i;j<input;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2;i<=input;i++) {
			for(int j=i+1;j<=input;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
