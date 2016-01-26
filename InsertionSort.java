import java.util.Arrays;
public class InsertionSort {

    public static void main(String a[]){

      int[] arr1 = new int[15];
      for (int i = 0; i < arr1.length; i++) {
        arr1[i] = (int) (Math.random()*100);
      }
      System.out.println("Before insertion sort array is: \n" + Arrays.toString(arr1));
      arr1 = doInsertionSort(arr1);
      System.out.println("After insertion sort array is: \n" + Arrays.toString(arr1));

    }

    public static int[] doInsertionSort(int[] input){

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
