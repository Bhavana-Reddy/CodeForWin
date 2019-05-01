
public class InvertedRightTriangle {
	public void invertedRightTriangle(int input){
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
