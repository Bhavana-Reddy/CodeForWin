
public class InsertionSortAlgo {
    public void insertionSortAlgo(int ar[]){
    	
		for(int firstUnsortedIndex = 1;firstUnsortedIndex<ar.length;
				firstUnsortedIndex++) {
			int newElement = ar[firstUnsortedIndex];
			int i ;
			for(i=firstUnsortedIndex;i>0&&ar[i-1]>newElement;i--) {
				ar[i] = ar[i-1];
			}
			ar[i] = newElement;
		}
	}
}
