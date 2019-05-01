
public class EightStarPattern {
	public void eightStarPattern(int input){
		for(int i=1;i<=input;i++) {
			if(i==1||i==input) {
				System.out.print(" ");
				for(int j=2;j<input;j++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int j=2;j<input;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for(int i=1;i<input;i++) {
			if(i==input-1) {
				System.out.print(" ");
				for(int j=2;j<input;j++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int j=2;j<input;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
