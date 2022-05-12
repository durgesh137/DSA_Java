package problems;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Union of 2 arrays:
 * Given two arrays a[] and b[] of size n and m respectively.
 * The task is to find union between these two arrays.
 *
 * Union of the two arrays can be defined as the set
 * containing distinct elements from both the arrays.
 * If there are repetitions, then only one occurrence of
 * element should be printed in the union.
 *
 * TC: O((n+m)log(n+m))
 * SC: O(n+m)
 */
public class UnionOfTwoArrays {
    /**
     * method to obtain union of both the arrays
     * can be done either using hashmap or hashset
     * @param a
     * @param n
     * @param b
     * @param m
     * @return
     */
    public static int doUnion(int a[], int n, int b[], int m){
        //map only stores unique keys, duplicates never added
        HashMap<Integer, Integer> intMap = new HashMap<>();
        for(int element: a){
            //even if duplicate found that will not be added
            intMap.put(element,1);
        }

        for(int element: b){
            intMap.put(element,1);
        }
        //total elements present is the union of both the arrays
        return intMap.size();
    }

    public static int doUnionUsingSet(int a[], int n, int b[], int m){
        //store all uniques integers in both arrays
        HashSet <Integer> intSet = new HashSet<>();

        //populating set with distinct elements of a[]
        for(int element : a){
            intSet.add(element);
        }

        //populating set with distinct elements of b[]
        for(int element : b){
            intSet.add(element);
        }

        //now elements in hashset will have all unique elements in a[] and b[]
        return intSet.size();
    }
}
/**
 * Example 1:
 *
 * Input:
 * 5 3
 * 1 2 3 4 5
 * 1 2 3
 * Output:
 * 5
 * Explanation:
 * 1, 2, 3, 4 and 5 are the
 * elements which comes in the union set
 * of both arrays. So count is 5.
 */