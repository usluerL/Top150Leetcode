package questions;

import com.sun.source.tree.Tree;

import java.util.*;

public class IntegerArrayQuestions {

    public static String IntegerArrayOperations(String str) {
        return arrangeResult(str);
    }

    static TreeSet<Integer> findDups(String str) {
        Map<String, Integer> hm = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        String[] strArr = str.split(";");
        for (String key : strArr) {
            if (hm.containsKey(key)) {
                set.add(Integer.parseInt(key));
            }
            hm.put(key, 1);
        }
        return set;
    }

    static Set<String> findUniques(String str) {
        if (str.isEmpty()){
            return  new LinkedHashSet<>();
        }
        String[] strArr = str.split(";");
        Set<String> hs = new LinkedHashSet<>();
        Collections.addAll(hs, strArr);
        return hs;

    }


    static String arrangeResult(String str) {
        StringBuilder sb = new StringBuilder();
        TreeSet<Integer> dups = findDups(str);
        sb.append(dups.size());
        sb.append(";");
        if (dups.size() == 0){
            sb.append("0;");
        } else {
            sb.append(String.join(";",dups.first().toString()));
            sb.append(";");
            sb.append(String.join(";",dups.last().toString()));
            sb.append(";");
        }
        Set<String> uniques = findUniques(str);
        if (uniques.size() == 0){
            sb.append("0");
        }else {
            sb.append(String.join(";",uniques));
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "";
        String str2 = "13;13;13;4;4;1;2";
        System.out.println(IntegerArrayQuestions.IntegerArrayOperations(str2));
    }

}
