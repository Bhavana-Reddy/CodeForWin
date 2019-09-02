import java.util.Scanner;

public class NoofFives {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the n value - ");
	int n = s.nextInt();
     int count =0;
     int i=1;
     while(n>0) {
    	 n = (int) (n/5);
    	 count=n+count;
     }
     System.out.println("the final count -"+count);
	}
}
