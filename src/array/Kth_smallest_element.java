package array;

import java.util.Arrays;

public class Kth_smallest_element {
    public static void main(String[]args){

        int [] arr = {3,1,3,3,2};
        int n = arr.length;
        int k=4;

        Arrays.sort(arr);

        System.out.println(arr[k-1]);
    }
}
