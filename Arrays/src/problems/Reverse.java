package problems;

import java.util.Arrays;

/**
 * Reverse the array in place
 */
public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int size = arr.length;//odd len
        reverseArray(arr, size);

        arr = new int[] {10,100,500,1000, 1500, 2000};
        size = arr.length;//even length
        reverseArray(arr, size);

    }
    public static void reverseArray(int arr[], int size){
        if(size <=1 || arr == null)
            return;
        System.out.println("input[]: "+Arrays.toString(arr));
        /**
         * {1,2,3,4,5} => {5,4,3,2,1}
         * index 0 -> index 4
         * index 1 -> index 3
         * index 2 -> index 2 remain same
         * using 2 pointer approach
         */
        int start = 0,  end = size-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        System.out.println("Reversed[]: "+ Arrays.toString(arr)+"\n");
    }
}
