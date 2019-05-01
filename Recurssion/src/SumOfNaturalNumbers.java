
public class SumOfNaturalNumbers {
	public int sumOfNaturalNumbers(int lower, int upper){
	
		if(lower==upper) {
//			System.out.println("goes when lower>=upper");
//			System.out.println("the value of sum when lower>=upper"+sum);
			return lower;
		}else {
//			System.out.println("when lower is less than upper");
//			System.out.println("the sum before method "+sum);
			return  lower+sumOfNaturalNumbers(lower+1,upper);
//			System.out.println("the sum after method "+sum);
//			return sum;
		}
		
	}
}
