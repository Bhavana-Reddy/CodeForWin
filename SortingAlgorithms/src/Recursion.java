import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num value : ");
		int num = s.nextInt();
		int iterativeFactorial = iterativeFact(num);
		System.out.println("iterativeFactorial is : "+iterativeFactorial);
		int recursiveFactorial = recursiveFact(num);
		System.out.println("recursiveFactorial is :"+recursiveFactorial);
	}
	private static int recursiveFact(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return num*recursiveFact(num-1);
		}
		
	}
	public static int iterativeFact(int num){
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		return fact;
	}

}
