package math.bitwise;


/*
Problem No: 137
Problem Title:  Single Number II


Difficulty: Medium
URL: https://leetcode.com/problems/single-number-ii/description/?envType=study-plan-v2&envId=top-interview-150

Trick: right shift calculate each number. left shift by ...

*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    // sorting
    public int singleNumberSort(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) count++;
            else if (nums[i] != nums[i + 1]) {
                if (count == 3) count = 1;
                else return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    //sorting smarter

    public int singleNumberSortSmarter(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 3) {
            if (nums[i] != nums[i + 1]) return nums[i];

        }
        return nums[nums.length - 1];
    }

    public int singleNumberHm(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            int count = hm.getOrDefault(num, 0) + 1;
            hm.put(num, count);
        }
        for (Integer i : hm.keySet()) {
            if (hm.get(i) != 3) return i;
        }

        throw new IllegalArgumentException();
    }

    // bitwise operators approach no extra space with 0(n)

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                sum += (num >> i) & 1;
            }
            int singleBit = sum % 3;
            single = single | (singleBit << i);
        }
        return single;
    }


    public static void main(String[] args) {
        SingleNumberII sn2 = new SingleNumberII();
        int[] arr = {0, 0, 0, 1, 1, 1, 3, 3, 3, 4, 4, 4, 9};
        System.out.println(sn2.singleNumberSort(arr));
        System.out.println(sn2.singleNumberSortSmarter(arr));
        System.out.println(sn2.singleNumberHm(arr));
        System.out.println(sn2.singleNumber(arr));
    }
}
