public class LengthOfLastWord {

            /*
Problem No: 58
Problem Title: Length Of Last Word
Difficulty: Easy
URL: https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150

Trick: from end to  beginning, no need to check after count > 0!
*/

    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;

        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                count++;
            } else if (count > 0) return count;

        }
        return count;
    }

    public static void main(String[] args) {
        String s = "a";

        LengthOfLastWord LLW = new LengthOfLastWord();

        System.out.println(LLW.lengthOfLastWord(s));

    }

}
