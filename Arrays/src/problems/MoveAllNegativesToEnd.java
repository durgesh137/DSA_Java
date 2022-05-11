package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an unsorted array arr[] of size N having both negative and
 * positive integers.
 * The task is place all negative element at the end of array
 * without changing the order of positive element and
 * negative element.
 *
 * TC: O(N)
 * SC: O(N)
 */
public class MoveAllNegativesToEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        segregateElementsMaintainingPositiveNegativeOrder(arr,n);
        input.close();//close stream

    }
    public static void segregateElementsMaintainingPositiveNegativeOrder(int arr[], int n){
        if(n<=1 || arr == null)
            return;
        System.out.println("original Arr[]: "+Arrays.toString(arr));
        //creating temporary[]
        int temp[] = new int[arr.length];
        int index = 0;
        int i=0;
        //put all positives first
        for(i=0; i<arr.length; i++){
            if(arr[i] >=0){
                temp[index] = arr[i];
                index++;
            }
        }

        //put all negatives now
        for( i=0; i<arr.length; i++){
            if(arr[i] <0){
                temp[index] = arr[i];
                index++;
            }
        }

        /**
         * copy each element 1 by 1 to original[]
         */
        for(i=0; i<n; i++){
            arr[i] = temp[i];
        }

    }
}

/**
 * Input :
 * N = 8
 * arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
 * Output :
 * 1  3  2  11  6  -1  -7  -5
 *
 * Example 2:
 * Input :
 * N=8
 * arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
 * Output :
 * 7  9  10  11  -5  -3  -4  -1
 */
//https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1