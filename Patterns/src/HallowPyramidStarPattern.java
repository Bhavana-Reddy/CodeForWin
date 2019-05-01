
public class HallowPyramidStarPattern {
	public void hallowPyramidStarPattern(int input){
		for(int i=1;i<=input;i++) {
			
			for(int j=input-i;j>0;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=1;k<=2*i-2&&i!=input;k++) {
				System.out.print(" ");
			}
			if(i>1)
			System.out.print("*");
			if(i==input) {
				for(int j=1;j<2*input-1;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}	
	}
}
