package problems;

/**
 * this code is working tested on positives only for now
 */
public class MinMaxElementInArray {
    public static void main(String[] args) {
        long arr[] = {1, 345, 234, 21, 56789};
        long size = arr.length;
        pair pair = getMinMax(arr,size);
        pair.show();
    }
    public static pair getMinMax(long arr[], long n){
        if(n<1){
            return null;
        }else if(n == 1){
            return new pair(arr[0], arr[0]);
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
            return new pair(min,max);
        }
    }
}

class pair{
    long first, second;
    public pair(long first, long second){
        this.first = first;
        this.second = second;
    }
    public void show(){
        System.out.println("Min = "+first+" Max = "+second);
    }
}