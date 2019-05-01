
public class HallowSquareStarPattern {
 public void hallowSquareStarPattern(int input) {
	 for(int i=0;i<input;i++) {
		 for(int j=0;j<input;j++) {
			 if(i==0||i==input-1||j==0||j==input-1||j==i||j==input-i-1) {
				 System.out.print("* ");
			 }else {
				 System.out.print("  ");
			 }
		 }
		 System.out.println();
	 }
 }
}
