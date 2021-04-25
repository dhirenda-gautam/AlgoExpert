package easy;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static void main(String[] args) {
        int arr[] = {3,5,-4,8,11,1,-1,6};
        int k =10;

        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            int complement = k - num;
            if(set.contains(complement)){
                System.out.println("Pair Exist");
                return;
            } else{
                set.add(num);
            }
        }
        System.out.println("Pair doesn't exist");
    }
}
