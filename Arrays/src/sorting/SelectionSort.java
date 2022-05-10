package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println("input[]: "+ Arrays.toString(arr));
        sortArray(arr, arr.length);
        System.out.println("Sorted[]: "+Arrays.toString(arr));
    }

    /**
     * sorting [] in ascending order
     * Time compelxity : O(n^2)
     * @param arr
     * @param n
     */
    public static void sortArray(int arr[], int n){
        if(n <= 1 || arr == null)
            return;
        for(int i=0; i<arr.length; i++){
            int small =i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[small]){
                    small = j;
                }
            }
            //swap elements at i and smallest index in current iteration
            swap(arr,i,small);
        }// loop...ends
        return ;
    }

    /**
     * helper method to swap elements at given indexes in int[]
     * @param arr
     * @param i
     * @param j
     */
   private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
