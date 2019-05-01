
public class HallowInvertedMirroredRightTriangle {
	public void hallowInvertedMirroredRightTriangle(int input){
		for(int i=1;i<=input;i++) {
			
			for(int j=1;j<=input-1;j++) {
				if(i==1) {
				System.out.print("*");
				}
			}
			
			for(int j=i-1;j>0;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
            if(i>1&&i<input) {
  				for(int k=input-(i+1);k>0;k--) {
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
