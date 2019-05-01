
public class HallowInvertedRightTriangle {
	public void hallowInvertedRightTriangle(int input){
		
		for(int i=1;i<=input;i++) {
			
			for(int j=1;j<=input-1;j++) {
				if(i==1)
				System.out.print("*");
			}
			System.out.print("*");
			
			for(int j=input-(i+1);j>0;j--) {
				System.out.print(" ");
			}
			
			if(i>1&&i<input) {
				System.out.print("*");
			}
	
			System.out.println();
		}
		
	}

}
