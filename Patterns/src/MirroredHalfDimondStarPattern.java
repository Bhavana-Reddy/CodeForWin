
public class MirroredHalfDimondStarPattern {
	public void mirroredHalfDimondStarPattern(int input){
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=input-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
