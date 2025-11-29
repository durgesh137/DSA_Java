package problems;

import samples.ArraySamples;

/**
 * this code is working tested on positives only for now
 */
public class MinMaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 345, 234, 21, 56789, 123456, 987654321, 4567};
        System.out.println("\nArray Elements are:");
        ArraySamples.printIntArray(arr);

        Pair pair = getMinMax(arr,arr.length);
        printResults(pair);

        //working on more test cases
        int[] randomNegativeIntArray = ArraySamples.createRandomNegativeIntArray(14, 100);
        System.out.println("\nRandom Negative Integer Array:");
        ArraySamples.printIntArray(randomNegativeIntArray);
        pair = getMinMax(randomNegativeIntArray,arr.length);
        printResults(pair);


    }

    /**
     * method to print the min max pair
     * @param pair
     */
    public static void printResults(Pair pair){
        if(pair != null){
            pair.show();
        }else{
            System.out.println("No min max found");
        }
    }

    public static Pair getMinMax(int arr[], long n){
        if(n<1){
            return null;
        }else if(n == 1){
            return new Pair(arr[0], arr[0]);
        }else{
            //assume first element as largest one
            long max = arr[0];
            //assume larges possible integer value as minimum
            long min = Integer.MAX_VALUE;
            for(long element : arr){
                if(element > max){
                    max = element;
                }
                if(min > element ){
                    min = element;
                }
            }
            return new Pair(min,max);
        }
    }
}

class Pair {
    long min, max;
    public Pair(long min, long max){
        this.min = min;
        this.max = max;
    }
    public void show(){
        System.out.println("Min = "+ min +" Max = "+max);
    }
}