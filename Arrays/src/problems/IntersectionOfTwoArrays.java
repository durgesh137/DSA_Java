package problems;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given two arrays a[] and b[] respectively of size n and m, the task is to print
 * the count of elements in the intersection (or common elements) of the two arrays.
 *
 * For this question, the intersection of two arrays can be defined as the
 * set containing distinct common elements between the two arrays.
 */
public class IntersectionOfTwoArrays {
    /**
     * method to obtain intersection of two arrays using hashmap
     * here to track duplicates, value for each key will be handy
     * @param a
     * @param b
     * @param n
     * @param m
     * @return
     */
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
      int elements = 0;
      //use hashmap to store all unique elements of arrays
      HashMap<Integer, Integer> intMap = new HashMap<>();

      //add unique elements of a[] first
        for(int element : a){
            intMap.put(element,1);
        }

      //obtaining intersection
      //now remove each element of hashmap if not there in b[]
      for(int element : b){
          //if set does not contain that element
          if(intMap.containsKey(element)){
            //https://stackoverflow.com/questions/4157972/how-to-update-a-value-given-a-key-in-a-hashmap
             intMap.put(element, intMap.get(element)+1);
          }
      }
      //now only elements having more than 1 occurrences are the intersection
      for(Integer key : intMap.keySet() ){
          if(intMap.get(key) > 1){
                elements++;
          }
      }
        return elements;
    }

    /**
     * using hashset to obtain intersection
     * populate hashset with a[] elements
     * count each matching element of b[] already there in hashset will be intersection value
     * the matching element should be removed, in case duplicates occur in b, that does not get counted
     * @param a
     * @param b
     * @param n
     * @param m
     * @return
     */
    public static int NumElementsInIntersectionUsingHashSet(int a[], int b[], int n, int m) {
        int matches = 0;
        //use hashmap to store all unique elements of arrays
        HashSet<Integer> intSet = new HashSet<>();

        //add unique elements of a[] first
        for(int element : a){
            intSet.add(element);
        }

        //obtaining intersection
        //now remove each matching element of intSet
        for(int element : b){
            //if set does not contain that element
            if(intSet.contains(element)){
                matches++;
                intSet.remove(element);
            }
        }
        return matches;
    }
}

//https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1
