package problems.level2;

/**
 * For an Array size N-1 having integers in range[1,N].
 * All elements are distinct. Find the missing element
 */
public class FindMissingNumber {
    /**
     * method to obtain the missing number from int[]
     * @param arr
     * @param n
     * @return
     */
    private static int getMissingNumber(int arr[], int n){
        int missing = 0;
        //obtain sum of n numbers 1,N
        int sum = sumOfN(n);
        int arrSum = 0;
        //obtain array sum
        for(int element : arr){
            arrSum +=element;
        }
        //obtain difference if sum is greater
        if(sum >arrSum){
            missing = sum - arrSum;
        }
        return missing;
    }
    private static int sumOfN(int n){
        return (n*(n+1))/2;
    }
}
//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1