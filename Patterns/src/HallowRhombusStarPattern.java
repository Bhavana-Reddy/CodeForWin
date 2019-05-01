
public class HallowRhombusStarPattern {
	public void hallowRhombusStarPattern(int input) {
		for(int i=1;i<=input;i++) {
			for(int j=i;j<=input;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<input;j++) {
				if(i==1||i==input) {
					System.out.print("*");
				}
			}
			for(int j=1;j<input;j++) {
				System.out.print(" ");
			}
			if(i>1&&i<input){
			System.out.print("/");
			}
			System.out.println();
		}		
	}
}
