
public class HallowMirroredRightTriangle {
	public void hallowMirroredRightTriangle(int input){
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<=input-1;j++) {
				if(i==input) {
					System.out.print("*");
				}
			}
			if(i>1&&i<input) {
				for(int k=1;k<i-1;k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}	
			System.out.println();
		}	
	}
}
