
public class PlusStarPattern {
	public void plusStarPattern(int input){
		for(int i=1;i<input;i++) {
			for(int j=1;j<input;j++) {
				System.out.print(" ");
			}
			System.out.print("+");
			System.out.println();
		}
		for(int j=1;j<2*input;j++) {
			System.out.print("+");
		}
		System.out.println();
		
		for(int i=1;i<input;i++) {
			for(int j=1;j<input;j++) {
				System.out.print(" ");
			}
			System.out.print("+");
			System.out.println();
		}
		
	}

}
