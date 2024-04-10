package array;

import java.util.HashMap;

public class Majority_element {
    public static void main (String [] args){
        int [] arr = {3,1,3,3,2};
        int n = arr.length;

        HashMap<Integer,Integer> occur = new HashMap<>();

        for(int num :arr){
            occur.put(num, occur.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int key: occur.keySet()){
            if(occur.get(key) > (n/2) ){
                System.out.println(key);
                count++;
            }
        }

        if(count==0){
            System.out.println(-1);
        }

        System.out.println(occur);

    }
}
