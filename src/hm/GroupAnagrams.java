package hm;

import java.util.*;

public class GroupAnagrams {


                            /*

                            todo revisit this question.
Problem No: 49
Problem Title:  Group Anagrams

Difficulty: Medium
URL: https://leetcode.com/problems/group-anagrams/description/

Trick: Map(String-List) same approach with ValidAnagrams if map.contains(charArr, List<>words)

*/


    List<List<String>> groupAnagrams(String[] strs) {

        Map<String, LinkedList<String>> resultMap = new HashMap<>();

        for (String str : strs) {
            char[] freq = new char[26];
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i) - 'a']++;
            }
            String key = String.valueOf(freq);
            System.out.println("string value of char arr: ->" + key.toString());

            LinkedList<String> list = resultMap.getOrDefault(key, new LinkedList<>());
            list.add(str);

            resultMap.put(key, list);

        }
        return new ArrayList<>(resultMap.values());
    }


    public static void main(String[] args) {
     String[] input  = {"eat","tea","tan","ate","nat","bat"};

     GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(input));
    }

}
