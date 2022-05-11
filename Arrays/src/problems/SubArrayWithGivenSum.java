package problems;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given an unsorted array A of size N that contains
 * only non-negative integers, find a continuous sub-array
 * which adds to a given number S.
 *
 * In case of multiple subarrays, return the subarray
 * which comes first on moving from left to right
 * TC: O(N)
 */
public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = input.nextInt();
        input.nextLine();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(subarraySum(arr,n,s));
        input.close();//close stream
    }
    /**
     *
     * Approach:
     * 1. initialize sumSoFar with arr[0]
     * 2. For each element from index 1 till last including n
     * [A]-> check while sumSoFar is more than required sum S, also start should not be less than i-1
     * i.then shift the start index by 1
     * ii. subtract arr[start] from sumSoFar as well
     * [B] -> check if sumSoFar == s, then break
     * [C] -> check if i is less than n then add arr[i] to  sumSoFar
     * 3.
     * i. if sum is found then store start and i+1 in list
     * ii. else store -1 in list
     * 4. return list
     * Function to find a continuous sub-array which adds up
     * to a given number.
     * @param arr
     * @param n
     * @param s
     * @return
     */
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int sumSoFar =arr[0], start = 0;
        int i =0;
        boolean sumFound = false;
        for(i=1; i<=n; i++){
            //check sum more than s then remove first element
            while(sumSoFar > s && start < i-1){
                sumSoFar -=arr[start];
                start++;
            }
            if(sumSoFar == s){
                sumFound = true;
                break;
            }
            if( i<n){
                sumSoFar += arr[i];
            }
        }
        //add all elements in [start, i-1]
        if(sumFound){
            //1-based indexing
            list.add(start+1);
            list.add(i);
        }

        return list;
    }
}

//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
/**
 * output1:
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 * [1, 5]
 *
 * output2:
 42 468
 135 101 170 125 79 159 163 65 106 146 82 28 162 92 196 143 28 37 192 5 103 154 93 183 22 117 119 96 48 127 172 139 70 113 68 100 36 95 104 12 123 134
 [38, 42]
 */

/**
 * simple idea is to add each element one by one to sum variable.
 * check if sum>s, then subtract arr[start] from sum and increase start by 1
 * once sum is found that is sum ==s, then return the start+1, i as the indexes in 1-based indexing
 * if sum not found, then add -1 in list and return
 */