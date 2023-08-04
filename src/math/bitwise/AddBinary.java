package math.bitwise;

/*
Problem No: 67
Problem Title: Add Binary


Difficulty: Easy
URL: https://leetcode.com/problems/add-binary/description/?envType=study-plan-v2&envId=top-interview-150

Trick: carry /2= whatever the case. so no worry if carry = 2 then 0,  carry=1 then 0 carry=3 than 1

*/


public class AddBinary {

    public String addBinary(String a, String b) {
        if (a.length() < b.length()) return addBinary(b, a);
        int carry = 0;
        int len = a.length();
        int j = b.length()-1;
        StringBuilder sb = new StringBuilder();

        for (int i = len - 1; i >= 0; i--) {
            if (j >= 0 && b.charAt(j--) == '1') carry++;
            if (a.charAt(i) == '1') carry++;
            if (carry == 2) {
                sb.append('0');
            } else if (carry % 2 == 1) sb.append('1');
            else sb.append(0);
            carry /= 2;
        }
        if (carry == 1) sb.append('1');
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary pr = new AddBinary();
        System.out.println(pr.addBinary("11111", "1111"));
        System.out.println(pr.addBinary("10", "11"));
    }
}
