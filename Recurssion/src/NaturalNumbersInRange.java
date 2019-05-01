
public class NaturalNumbersInRange {
	public void naturalNumbersInRange(int lower, int upper){
        // int res;
		if(lower>=upper) {
			
			//res = lower;
			System.out.println(lower);
		}else {
			System.out.println(lower);
//			System.out.println("Lower value : "+lower);
//			System.out.println("Upper Value :"+upper);
			naturalNumbersInRange(lower+1,upper);
			
			
		}
		
		
	}
	
	
	
//	public void naturalNumbersInRange(int lower, int upper){
//		System.out.println(lower);
//	     if(lower>=upper) {
//	    	 return;
//	     }else {
//	    	 naturalNumbersInRange(lower+1,upper);
////	    	 System.out.println("Lower limit :"+lower);
////	    	 System.out.println("Upper limit :"+upper);
//	     }
//	}
}
