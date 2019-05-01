
public class PyramidStarPattern {
	public void pyramidStarPattern(int input){
		for(int i=1;i<=input;i++) {
			for(int j=input-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
