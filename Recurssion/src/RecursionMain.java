import java.util.Scanner;

public class RecursionMain {
     public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
//		System.out.println("enter base value : ");
//		int base = s.nextInt();
//		System.out.println("enter the power value : ");
//		int power = s.nextInt();
//		
//		PowerOfNumber p = new PowerOfNumber();
//		double pow = p.powerOfNumber(base,power);
//		System.out.println("The result value is :"+pow);
		
//		System.out.println("enter the lower value:");
//		int lower = s.nextInt();
//		System.out.println("enter the upper value:");
//		int upper = s.nextInt();
//		
//		NaturalNumbersInRange nm = new NaturalNumbersInRange();
//		//int naturalNumbers = nm.naturalNumbersInRange(lower,upper);
//		//System.out.println(naturalNumbers);
//		nm.naturalNumbersInRange(lower, upper);
//		
//		EvenOrOddInRange eo = new EvenOrOddInRange();
//		System.out.println("Even/Odd Numbers :");
//		eo.evenOrOddInRange(lower, upper);
	
//		SumOfNaturalNumbers sm = new SumOfNaturalNumbers();
//		int sumofNaturalNumbers =  sm.sumOfNaturalNumbers(lower, upper);
//		System.out.println(sumofNaturalNumbers);
		
//		SumOfEvenOrOddInRange seo = new SumOfEvenOrOddInRange();
//		int SumOfEvenOrOddInRange = seo.SumOfEvenOrOddInRange(lower, upper);
//		System.out.println(SumOfEvenOrOddInRange);
		
		System.out.println("Enter n value");
		int n = s.nextInt();
		int sum=0;
		ReverseOfNumberRecurssion rev = new ReverseOfNumberRecurssion();
		int revNo = rev.ReverseOfNumberRecurssion(sum, n);
		System.out.println();
		
//		SumOfDigits sd = new SumOfDigits();
//		int sumd = sd.sumOfDigits(n);
//		System.out.println(sumd);
		
//		RecFactorial fac = new RecFactorial();
//		int factorial = fac.RecFactorial(n);
//		System.out.println(factorial);
	}
}
