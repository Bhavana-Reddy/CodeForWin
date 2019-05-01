import java.util.Scanner;

public class MainMethod {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the input value : ");
	// int input = s.nextInt();
	 //int input2 = s.nextInt();
	 int start = s.nextInt();
	 int end  = s.nextInt();
	 
//	 CubeMethod cm = new CubeMethod();
//	 cm.cubeMethod(input);
	 
//	 CircleMeasurments cm = new CircleMeasurments();
//	 double circumference = cm.circleCircumference(input);
//	 System.out.println("The circumference of circle is :"+circumference);
//	 double area = cm.circleArea(input);
//	 System.out.println("The area of circle is :"+area);
//	 double diameter = cm.circleDiameter(input);
//	 System.out.println("The diameter of circle is :"+diameter);
	 
//	 MaximumAndMinimum mm = new MaximumAndMinimum();
//	 int maximum = mm.maximum(input, input2);
//	 System.out.println("The max value between 2 is :"+maximum);
//	int minimum =  mm.minimum(input, input2);
//	System.out.println("The min value b/w 2 is :"+minimum);
	 
//	 EvenOrOdd eo = new EvenOrOdd();
//	 String evenOrOdd = eo.checkEvenOrOdd(input);
//	 System.out.println("the input is :"+evenOrOdd);
	 
//	 PrimeOrArmstrongOrPerfect n = new PrimeOrArmstrongOrPerfect();
//	boolean armstrong = n.armstrong(input);
//	System.out.println("Is it a armstrong number :"+armstrong);
//	boolean perfect = n.perfect(input);
//	System.out.println("Is it a perfect number :"+perfect);
//	 boolean prime = n.prime(input);
//	 System.out.println("Is it a prime number :"+prime);
	 
//	 PrintingPerfectNumbersInRange pn = new PrintingPerfectNumbersInRange();
//	 pn.PrintingPerfectNumbersInRange(start, end);
	 
//	 PrintingPrimeNumbersInRange primenumbers = new PrintingPrimeNumbersInRange();
//	 primenumbers.printingPrimeNumbersInRange(start, end);
	 
//	 PrintingArmstrongNumbersInRange an = new PrintingArmstrongNumbersInRange();
//	 an.printingArmstrongNumbersInRange(start, end);
	 
	 PrintingStrongNumbersInRange sn = new PrintingStrongNumbersInRange();
	 sn.printingStrongNumbersInRange(start, end);
	 
}


}
