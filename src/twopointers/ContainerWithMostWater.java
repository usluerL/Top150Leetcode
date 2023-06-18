package twopointers;

public class ContainerWithMostWater {

                        /*
Problem No: 11
Problem Title: Container With Most Water
Difficulty: Easy
URL: https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150

Trick: Two Pointer start, end shift the small one.

                 */

    public int maxArea(int[] height) {
        int max = 0;
        int first = 0;
        int second = height.length - 1;
        while (first < second) {
            int w = second - first;
            int h = Math.min(height[second], height[first]);
            max = Math.max(max, h * w);

            if (height[second] < height[first]) {
                second--;
            } else {
                first++;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        int[] height = {1, 1, 2};

        System.out.println(cwmw.maxArea(height));
    }
}
