
public class SumOfEvenOrOddInRange {
	public int SumOfEvenOrOddInRange(int lower, int upper){
		if(lower>upper) {
			return 0;
		}else {
			return lower+SumOfEvenOrOddInRange(lower+2,upper);
		}
	}

}
