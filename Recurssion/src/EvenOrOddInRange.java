
public class EvenOrOddInRange {
	
	public void evenOrOddInRange(int lower, int upper){
		
		if(lower>=upper) {
			return;
			//System.out.println(lower);
		}
		
		else {
			System.out.println(lower);
			evenOrOddInRange(lower+2,upper);
			
		}
	}
}
