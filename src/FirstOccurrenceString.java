public class FirstOccurrenceString {


            /*
Problem No: 28
Problem Title: Find the Index of the First Occurrence in a String

Difficulty: Easy
URL: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150

Trick: haystack --> needle startsWith() method.
*/

    public int strStr(String haystack, String needle) {
        int len = haystack.length();

        for (int i = 0; i < len; i++) {
            String word = haystack.substring(i);

            if (word.startsWith(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstOccurrenceString fos = new FirstOccurrenceString();

        System.out.println(fos.strStr("safbuttruesad", "sa"));
    }

}
