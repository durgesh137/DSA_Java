package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println("input[]: "+ Arrays.toString(arr));
        sortArray(arr, arr.length);
        System.out.println("Sorted[]: "+Arrays.toString(arr));
    }
    /**
     * method to bubble sort given array
     * @param arr
     * @param n
     */
    public static void sortArray(int arr[], int n){
        if(n == 1){
            return;
        }
        for(int i=0; i<arr.length; i++){
            //in each iteration larger element will placed at end
            //so with each iteration reduce the window size by i value
            for(int j=0; j<arr.length-i-1; j++){
                //swap element if element at jth less than j+1
                if(arr[j] >arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    /**
     * method to swap elements at given indexes from int[]
     * @param arr
     * @param j
     * @param i
     */
    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
