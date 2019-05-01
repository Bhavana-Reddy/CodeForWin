
public class MaximumAndMinimum {
	public int maximum(int input, int input2){
		int max = input;
		if(input<input2 ) {
			max = input2;
		}else {
			max = input;
		}
		return max;
	
	}
	public int minimum(int input, int input2) {
		int  min = input;
		if(input<input2) {
			min = input;
		}else {
			min = input2;
		}
		return min;
		
	}
}
