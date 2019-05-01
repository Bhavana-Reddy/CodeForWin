
public class HalfDimondStarPattern {
  public void halfDimondStarPattern(int input){
	  for(int i=1;i<=input;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  
	  for(int i=input;i>0;i--) {
		  for(int j=i-1;j>0;j--) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }  	
	}
}
