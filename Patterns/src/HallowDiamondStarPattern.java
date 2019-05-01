
public class HallowDiamondStarPattern {
	public void hallowDiamondStarPattern(int input){
		for(int i=0;i<input;i++) {
			for(int j=input-i;j>0;j--) {
				System.out.print("*");
			}
			for(int j=2*i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=input-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<=input;i++) {
			
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			for(int j = 2*(input-i);j>0;j--) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
