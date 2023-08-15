package helper.dupsuniqsetc;

import java.util.*;
import java.util.stream.Collectors;


//Given a String with find num of dups, num of uniques, min element, max element etc.

public class FindDupsUniquesFirstLast {


    static Set<Integer> findDuplicatedUniques(String s) {
        String[] strArr = s.split(";");
        System.out.println(Arrays.toString(strArr));
        Map<String, Integer> hm = new HashMap<>();
        Set<Integer> hs = new HashSet<>();
        for (String s1 : strArr) {
            if (hm.containsKey(s1)) {
                hs.add(Integer.parseInt(s1));
            }
            hm.put(s1, 1);
        }
        System.out.println(hs);

        return hs;

    }

    static List<Integer> removeDups(String str) {
        String[] strArr = str.split(";");
        int[] values = Arrays.stream(strArr)
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> res = Arrays.stream(values).distinct().sorted().boxed().collect(Collectors.toList());

        System.out.println(res);
        return res;
    }


    public static void main(String[] args) {
        String osman = "0;1;1;2;3;5;6;3;3;3;3;5;13;13;13;13;5;6;7";

        System.out.println(osman);
        FindDupsUniquesFirstLast.removeDups(osman);
    }

}
