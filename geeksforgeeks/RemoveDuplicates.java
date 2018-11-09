public class RemoveDuplicates {
    public static void main(String[] args) {
            int[] array = {1,2,2};
	    System.out.println(new RemoveDuplicates().remove_duplicate(array, 3));
	}

    int remove_duplicate(int A[],int N) {    
        int fin =0;
		    for(int i=1;i<N;++i)
			    if(A[i]!=A[fin])
			        A[++fin]=A[i];
        return fin+1;
    }
}