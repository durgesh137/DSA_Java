package problems.level2;

import java.util.Arrays;

/**
 * Rotate the array
 * clockwise also called cyclic
 * Anticlockwise
 */
public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("input[]: "+ Arrays.toString(arr));
        rotateClockwise(arr,arr.length);
        System.out.println("Clockwise rotated[]: "+ Arrays.toString(arr));

        int []arr2 = {10,20,30,40,50};
        System.out.println("\ninput[]: "+ Arrays.toString(arr2));
        rotateAntiClockWise(arr2,arr2.length);
        System.out.println("Anti-Clockwise rotated[]: "+ Arrays.toString(arr2));

    }
    /**
     * method to rotate the array having n elements
     * @param arr
     * @param n
     */
    public static void rotateClockwise(int arr[], int n){
        if(n<=1 || arr ==null)
            return;
        /**
         * {1,2,3,4,5} ->
         * after 1 cyclic rotation
         * {5,1,2,3,4}
         */
        int lastOne = arr[n-1];
        //shift each element towards right by 1 position
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        //put the last element at index 0
        arr[0] = lastOne;
    }

    public static void rotateAntiClockWise(int arr[], int n){
        //validate array and size
        if(n<=1 || arr ==null)
            return;
        /**
         * {1,2,3,4,5} ->
         * after 1 anticlockwise or non-cyclic rotation
         * {2,3,4,5,1}
         */
        int firstElement = arr[0];
        for(int i=0; i<n-1;i++){
            arr[i] = arr[i+1];
        }
        //now put first element at last index
        arr[n-1] = firstElement;
    }
}