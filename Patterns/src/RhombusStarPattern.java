
public class RhombusStarPattern {
	public void rhombusStarPattern(int input) {
		for(int i=1;i<=input;i++) {
			for(int j=i;j<=input;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<input;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
