public class PowerOfNumber {
	
	public double powerOfNumber(int base, int power) {
		
		
			if(power==0) {
				return 1;
			}
			else if(power>0) {
				return base*powerOfNumber(base,power-1);
			}
			else {
				System.out.println("the value of abs power :"+Math.abs(power));
				return 1/powerOfNumber(base,Math.abs(power));
		}
	}
}
