package array;

import java.util.Arrays;

public class Find_Subarray_with_given_sum {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int x = 15;
        int n=arr.length;
        int l=0;
        int r=1;
        int sum=arr[l];

        while(r<n && l<n){
            System.out.println("sum "+ sum);
            if(sum!=x){
                System.out.println("sum !"+ sum);
                sum=sum+arr[r];
                r++;
            }


            if(sum>x){
                System.out.println("sum > "+ sum);
                sum=sum-arr[l];
                l++;
            }

            if(sum==x){
                System.out.println(l+" , "+r);
                break;
            }

        }

    }
}
