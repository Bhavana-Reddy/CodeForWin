
public class HallowInvertedPyramidStarPattern {
  public void hallowInvertedPyramidStarPattern(int input){
		
		for(int i=1;i<=input;i++) {
			for(int j=i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*input-(2*i-1)-1;j++) {
				if(i==1)
				System.out.print("*");
			}
			System.out.print("*");
	
			for(int j=1;j<=2*input-(2*i+1);j++) {
				System.out.print(" ");
			}
			if(i>1&&i<input) {
			System.out.print("*");
			}
			System.out.println();
		}
	  
	}
}
