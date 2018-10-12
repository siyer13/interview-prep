public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,7,20,30,40,50,60,70,80,90};
        int[] arr2 = {2,4,6,8,9,10,11,67};
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.print("Array1: [");
        for(int i = 0 ; i < arr1.length; i++) {
            if(i == arr1.length -1)
                System.out.print(arr1[i]);
            else
                System.out.print(arr1[i] + ",");
        }
        System.out.println("]");
        System.out.print("Array2: [");
        for(int i = 0 ; i < arr2.length; i++) {
            if(i == arr2.length -1)
                System.out.print(arr2[i]);
            else
                System.out.print(arr2[i] + ",");
        }
        System.out.println("]");
        int arr1_size = arr1.length;
        int arr2_size = arr2.length;
        arr3 = new MergeSortedArrays().mergeSortedArrays(arr1, arr2, arr3, arr1_size, arr2_size);
        System.out.print("Array3: [");
        for(int i = 0 ; i < arr3.length; i++) {
            if(i == arr3.length -1)
                System.out.print(arr3[i]);
            else
                System.out.print(arr3[i] + ",");
        }
        System.out.println("]");
   }

   public int[] mergeSortedArrays(int[] arr1, int[] arr2, int[] arr3, int size1, int size2) {
        int j = 0;
        int k = 0;
        int i = 0;
        for(;i<size1 && j<size2;) {
          if(arr1[i] < arr2[j]) {
            arr3[k] = arr1[i];
            k++;
            i++;
          }
          else if(arr2[j] < arr1[i]) {
            arr3[k] = arr2[j];
            k++;
            j++;
          }
          else if(arr1[i] == arr2[j]) {
            arr3[k] = arr1[i];
            arr3[++k] = arr2[j];
            k++;
            i++;
            j++;
          }
          }
          for(i=i; i < size1; i++) {
            arr3[k++] = arr1[i];
          }
          for(j=j; j < size2; j++) {
            arr3[k++] = arr2[j];
          }

        return arr3;
   }
}
