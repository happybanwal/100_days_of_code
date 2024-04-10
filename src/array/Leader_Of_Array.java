package array;

import java.util.ArrayList;

public class Leader_Of_Array {
    public static void main(String[] args){
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        ArrayList<Integer> leaders = new ArrayList<>();

        // Initialize the rightmost element as the leader
        int leader = arr[n - 1];
        leaders.add(leader);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            // If current element is greater than the leader, update leader and add it to the leaders list
            if (arr[i] > leader) {
                leader = arr[i];
                leaders.add(leader);
            }
        }

        // Print the leaders in reverse order
        System.out.println("Leaders in the array:");
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
    }
}
