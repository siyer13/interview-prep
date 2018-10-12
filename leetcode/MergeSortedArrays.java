public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.print("Array1: [");
        for(int i = 0 ; i < arr1.length; i++) {
            if(i == arr1.length -1) 
                System.out.print(arr1[i]);
            else
                System.out.print(arr1[i] + ",");
        }
        System.out.println("]");
   }
}
