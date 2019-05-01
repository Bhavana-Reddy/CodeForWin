
public class PrimeOrArmstrongOrPerfect {
	public boolean prime(int input){
		int count =0;
		
		for(int i =1;i<=input;i++) {
			if(input%i==0) {
				count++;
			}
		}
		
		if(count == 2) {
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean armstrong(int input){
		int sum =0;
		int r=0;
		int temp = input;
		while(input>0) {
			r = input%10;
			sum = sum+r*r*r;
			input = input/10;
		}
		input = temp;
		if(input==sum) {
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean perfect(int input){
		int sum=0;
		for(int i=1;i<input;i++) {
			if(input%i==0) {
				sum = sum+i;
			}
		}
		if(sum==input) {
		return true;
		}else {
			return false;
		}
	}

}
