package problems.level2;

/**
 * kth smallest element
 * Given an array arr[] and an integer K where K is smaller than size of array,
 * the task is to find the Kth smallest element in the given array.
 * It is given that all array elements are distinct.
 *
 * TC:O(n)
 * SC: Olog(n)
 */
public class KthSmallestElementAndLargest {

    /**
     * @\param arr
     * @param l start index
     * @param r end index
     * @param k smallest element to find
     * @return
     */
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        int temp[] = new int[k];
        for(int i=0; i<k; i++){
            temp[k] = Integer.MAX_VALUE-i;
        }
        while( l<r){

        }
       return temp[k-1];
    }

}

/**
 * Example 1:
 *
 * Input:
 * N = 6
 * arr[] = 7 10 4 3 20 15
 * K = 3
 * Output : 7
 * Explanation :
 * 3rd smallest element in the given
 * array is 7.
 */
