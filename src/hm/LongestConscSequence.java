package hm;

                            /*
Problem No: 128
Problem Title:  Longest Consecutive Sequence


Difficulty: Medium
URL: https://leetcode.com/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-interview-150

Trick: check has minus, if so cont, if not, +1, if so -->> count++; if not cont.

                 */

import java.util.HashSet;
import java.util.Set;

public class LongestConscSequence {

    int longestConsecutive(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int maxCount = 1;
        Set<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        for (int num : nums) {
            if (!hs.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;
                while (hs.contains(currentNum + 1)) {
                    currentNum = currentNum + 1;
                    currentCount++;
                }
                maxCount = Math.max(maxCount, currentCount);
            }
        }


        return maxCount ;
    }


    public static void main(String[] args) {

        int [] arr = {0,3,7,2,5,8,4,6,0,1};

        LongestConscSequence lcs = new LongestConscSequence();

        System.out.println(lcs.longestConsecutive(arr));

    }
}
