
public class SelectionSortAlg {
	public void selectionSortAlg(int ar[]){
		for(int lastUnsortedIndex=ar.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			int largestIndex =0;
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(ar[i]>ar[largestIndex]) {
					largestIndex = i;
				}
			}
			swap(ar,lastUnsortedIndex,largestIndex);
		}
		
	}

	private void swap(int[] ar, int lastUnsortedIndex, int largestIndex) {
		int temp = ar[lastUnsortedIndex];
		ar[lastUnsortedIndex] = ar[largestIndex];
		ar[largestIndex] = temp;
		
	}
}
