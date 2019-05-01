
public class ShellSort {
	public void shellSort(int[] ar) {
		for(int gap = ar.length/2;gap>0;gap = gap/2) {
			
			for(int i =gap;i<ar.length;i++) {
				int newElement = ar[i];
				
				int j=i;
				while(j>=gap&&ar[j-gap]>newElement) {
					ar[j] = ar[j-gap];
					j=j-gap;
				}
				 ar[j] = newElement ;
			}
		}
		
	}
}
