import java.util.Scanner;

public class SortingMainMethod {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elemets in Array");
		int n = s.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the values in the array");
		for(int i=0;i<n;i++) {
			ar[i] = s.nextInt();
		}
		
//		BubbleSortAlg bsa = new BubbleSortAlg();
//		bsa.bubbleSortAlg(ar);
		
//		SelectionSortAlg ssa = new SelectionSortAlg();
//		ssa.selectionSortAlg(ar);
		
//		ShellSort ss = new ShellSort();
//		ss.shellSort(ar);
		
		
		MergeSortAlgo msa = new MergeSortAlgo();
		ar = msa.mergeSortAlgo(ar);
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" -- ");
		}
		System.out.println();
		
	}
	
}
