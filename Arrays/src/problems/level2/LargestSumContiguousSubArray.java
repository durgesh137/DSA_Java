package problems.level2;

/**
 * find the largest sum of the contiguous
 * sub array for given 1D array
 */
public class LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int arr[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        System.out.println(maxSumSubArray(arr,n));

    }

    /**
     * Kadane's algorithm application
     * method to find the largest sum of the contiguous subarray
     * @param arr
     * @param n
     * @return
     */
    public static int maxSumSubArray(int arr[], int n){
        if(n <1)
            return 0;
        else if( n == 1)
            return arr[0];
        else{
            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;
            for(int i=0; i<n ; i++){
                currSum += arr[i];
                //whenever currSum is more than maxSum
                //update maxSum with currSum
                //here currSum variable adds contiguous elements always
                //so issue subarray is already taken care
                if(currSum >maxSum){
                    maxSum =currSum;
                }
                if(currSum < 0)
                    currSum = 0;
            }
            return maxSum;
        }
    }
}
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1/#