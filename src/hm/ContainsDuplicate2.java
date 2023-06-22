package hm;


        /*
Problem No: 219
Problem Title:  Contains Duplicates2
Difficulty: Easy
URL: https://leetcode.com/problems/contains-duplicate-ii/?envType=study-plan-v2&envId=top-interview-150

Trick: k == 0 return false, easy peasy.
*/

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    boolean containsNearbyDuplicate(int[] nums, int k) {

        int len = nums.length;
        if (len == 1 || k== 0) return false;
        Map<Integer, Integer> nMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (nMap.containsKey(key)) {
                if (Math.abs(nMap.get(key) - i) <= k) {
                    return true;
                }
            }
            nMap.put(key, i);
        }

        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicate2 cd2 = new ContainsDuplicate2();
        int[] arr = {1, 2, 3, 2, 4, 5};
        System.out.println(cd2.containsNearbyDuplicate(arr, 1));
    }
}
