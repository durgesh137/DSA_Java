package problems;

import samples.ArraySamples;

import java.util.Arrays;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,2,2,3};
        int x = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println("Frequency of "+x+": "+getFrequency(arr,x));

        //Testing the logic on more cases
        int[] randomIntArray = ArraySamples.createRandomIntArray(15, 10);
        randomIntArray = ArraySamples.createArrayWithDuplicates(randomIntArray,5);
        int testElement = 5;
        System.out.println("\nRandom Array with Duplicates: "+ Arrays.toString(randomIntArray));
        System.out.println("Frequency of "+testElement+": "+getFrequency(randomIntArray,testElement));


    }

    /**
     * method to find the frequency of an element
     * @param arr
     * @param x
     * @return
     */
    private static int getFrequency(int arr[], int x){
        int count = 0;
        if(arr== null || arr.length <1){
            return count;
        }
        for(int element : arr){
            if(element == x)
                count++;
        }
        return count;
    }
}

//easier problem, passed