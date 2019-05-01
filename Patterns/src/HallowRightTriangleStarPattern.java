
public class HallowRightTriangleStarPattern {
	public void hallowRightTriangleStarPattern(int input) {
		for(int i=1;i<=input;i++) {
			for(int j=1;j<i;j++) {
				if(i==input) {
					System.out.print("*");
				}
			}
			System.out.print("*");
			for(int j=1;j<i;j++) {
				if(i!=1||i!=input) {
					System.out.print(" ");
				}
			}
			if(i>1&&i<input) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
