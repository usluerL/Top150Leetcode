package math.bitwise;



/*
Problem No: 136
Problem Title:  Single Number


Difficulty: Easy
URL: https://leetcode.com/problems/sqrtx/?envType=study-plan-v2&envId=top-interview-150

Trick: If you XOR the number with itself, it is zero, if you XOR number with 0 it gives itself.

*/




public class SingleNumber {




    // no extra space and linear time complexity.

    public int singleNumber(int [] nums){
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
