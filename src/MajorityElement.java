public class MajorityElement {

            /*
Problem No: 169
Problem Title:  Majority Element
Difficulty: Easy
URL: https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150

Trick: Majority Element +1 other elements -1
*/

    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0){
                candidate = num;
            }
            count += candidate == num ? +1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,2,2,3,2,2,6,2};

        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(arr));


    }

}
