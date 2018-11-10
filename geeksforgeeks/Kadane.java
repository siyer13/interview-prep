public class Kadane {
	public static void main(String[] args) {
		int[] array = {3,1,4,5,6,10,1,2};
		int max_ending_here = 0;
		int max_so_far = 0;
		
		for(int i = 0; i < array.length; i++) {

        max_ending_here += array[i];

        if(max_ending_here > max_so_far) max_so_far = max_ending_here;

        if(max_ending_here < 0) max_ending_here = 0;

      }
	  System.out.println(max_so_far);
	}
}
