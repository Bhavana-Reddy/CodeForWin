
public class InvertedMirroredRightTriangle {
  public void invertedMirroredRightTriangle(int input){
	  for(int i=1;i<=input;i++) {
		  for(int j=i-1;j>0;j--) {
			  System.out.print(" ");
		  }
		  for(int k=input;k-i>=0;k--) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
		
	}

}
