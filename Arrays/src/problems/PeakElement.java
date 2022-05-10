package problems;

/**
 * An element is peak element if its value is not smaller than any of
 * its adjacent elements, if they exist.
 * For array[] size N, find index of a peak element
 */
public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int size = arr.length;
        System.out.println(peakElementInArray(arr,size));

    }
    public static int peakElementInArray(int arr[], int size){
        //validating array and size
        if(size <=1 || arr == null){
            return 0;
        }else if(size == 2) {
            if(arr[1] >= arr[0])
                return 1;
            return 0;
        }else{
            /** arr = {1,2,3}*/
            int index = -1;
            for (int i=1; i<size-1; i++){
                //check if ith element is more than i-1 and i+1
                if(arr[i-1] <=arr[i] && arr[i] >= arr[i+1]){
                    index = i;
                    break;
                }
            }
            //check if peak element not found so far
            if(index == -1){
                if(arr[size-1] >= arr[size-2]){
                    index = size-1;
                }else
                    index = 0;
            }
            return index;
        }
    }
}
//passed all test cases on geeksforgeeks