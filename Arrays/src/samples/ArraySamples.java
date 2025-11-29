package samples;

public class ArraySamples {
    /**
     * create random integer array of give size
     */
    public static int[] createRandomIntArray(int size, int bound) {
        if (size <= 0) {
            return new int[0];
        }
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * bound);
        }
        return arr;
    }

    /**
     * create array comprising all integers from start to end inclusive
     */
    public static int[] createSequentialIntArray(int start, int end) {
        if (end < start) {
            return new int[0];
        }
        int size = end - start + 1;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = start + i;
        }
        return arr;
    }

    /**
     * print the integer array
     */
    public static void printIntArray(int arr[]) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * generate integer array of negatives only
     */
    public static int[] createRandomNegativeIntArray(int size, int bound) {
        if (size <= 0) {
            return new int[0];
        }
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = -1 * (int) (Math.random() * bound);
        }
        return arr;
    }

    /**
     * generate integer array of both positives and negatives
     */
    public static int[] createRandomMixedIntArray(int size, int bound) {
        if (size <= 0) {
            return new int[0];
        }
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            int value = (int) (Math.random() * bound);
            // randomly choose sign
            arr[i] = (Math.random() < 0.5) ? value : -value;
        }
        return arr;
    }

    /**
     * Create array with n duplicates
     */
    public static int[] createArrayWithDuplicates(int[] baseArray, int duplicateCount) {
        if (baseArray == null || baseArray.length == 0 || duplicateCount <= 0) {
            return baseArray;
        }
        int newSize = baseArray.length + duplicateCount;
        int[] newArray = new int[newSize];
        System.arraycopy(baseArray, 0, newArray, 0, baseArray.length);
        for (int i = 0; i < duplicateCount; i++) {
            int randomIndex = (int) (Math.random() * baseArray.length);
            newArray[baseArray.length + i] = baseArray[randomIndex];
        }
        return newArray;
    }

}
