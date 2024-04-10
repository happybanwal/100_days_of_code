package array;

public class Kadane_Algorithm {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3}; // Note the commas separating the array elements
        int n = arr.length;
        int l = 0, r = 0, temp = 0, maxSum = arr[0]; // Initialize maxSum with the first element of the array
//        System.out.println("Initial maxSum: " + maxSum + " temp: " + temp + " l: " + l + " r: " + r);

        while (r < n) {
            temp = temp + arr[r];
            if (temp > maxSum) {
                maxSum = temp;
            }
            if (temp < 0) {
//                System.out.println("  maxSum: " + maxSum + " temp: " + temp + " l: " + l + " r: " + r);
                temp = 0;
                l = r + 1; // Move the left pointer to the next element
            }
            r++;
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
