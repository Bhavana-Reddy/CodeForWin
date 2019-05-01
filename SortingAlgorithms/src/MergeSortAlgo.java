
public class MergeSortAlgo {
 public int[] mergeSortAlgo(int[] ar){
	 System.out.println("Calling mergesort");
		ar = sorting(ar,0,ar.length-1);
		for(int k=0;k<ar.length;k++) {
			System.out.print(ar[k]+" ## ");
		}
		System.out.println();
		return ar;
		
	}

private int[] merge(int[] ar, int start, int mid, int end) {
	
	
	
System.out.println("Calling merge method ");
        	int[] newAr = new int[ar.length];
        	int i = start;
        	int j = mid;
        	int arrayTraversal = 0;
        	while(i<mid&&j<end) {
        		if(ar[i]<=ar[j]) {
        			newAr[arrayTraversal] = ar[i];
        			arrayTraversal++;
        			i++;	
        		}
        		else {
        			newAr[arrayTraversal] = ar[j];
        			arrayTraversal++;
        			j++;
        		}
        	}
        	while (i <mid) {
        		newAr[arrayTraversal] = ar[i];
    			arrayTraversal++;
    			i++;
        	}
        	while (j <=end) {
        		newAr[arrayTraversal] = ar[j];
    			arrayTraversal++;
    			j++;
        	}
        	System.out.println("the new Array is - ");
        	for(int k=0;k<newAr.length;k++) {
        		System.out.print(newAr[k]+" * ");
        	}
        	System.out.println();
        	//System.out.println("the size of new array is -"+newAr.length);
        	
        	return newAr;   
}

private int [] sorting(int[] ar, int start, int end) {
	System.out.println("Calling Sorting method");
	
	if(end-start<2) {
		return ar;
	}
	else {
		sorting(ar, start, start+end/2);
		sorting(ar, start+end/2, end);
		ar = merge(ar,start,start+end/2,end);
	}
	for(int k=0;k<ar.length;k++) {
		System.out.print(ar[k]+" & ");
	}
	System.out.println();
	return ar;
}	

}
