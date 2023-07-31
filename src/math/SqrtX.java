package math;


/*
Problem No: 69
Problem Title:  Sqrt


Difficulty: Easy
URL: https://leetcode.com/problems/sqrtx/?envType=study-plan-v2&envId=top-interview-150

Trick:  If looking in a range think about Binary Search.

*/
public class SqrtX {

    public int mySqrtBF(int x) {
        if (x == 0) return 0;
        for (int i = 1; i <= x ; i++) {
            long res = (long) i * i;
            if ( res > x) return i-1;
            if (res == x) return i;
        }
        return -1;
    }


    public int mySqrt(int x){
        if (x < 2) return x;
        int left = 2;
        int right = x/2;
        while (left <= right){
            int mid = (left+right)/2;
            long sqr = (long) mid *mid;
            if (sqr > x){
                right = mid-1;
            }else if (sqr < x){
               left = mid +1;
            } else {
                return mid;
            }


        }

        return right;
    }



    public static void main(String[] args) {
        SqrtX pr = new SqrtX();


        System.out.println(pr.mySqrtBF(4343434));


        System.out.println(pr.mySqrt(4343434));
    }

}
