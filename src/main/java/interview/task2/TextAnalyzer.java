package interview.task2;

import java.util.*;
import java.util.stream.Collectors;

public class TextAnalyzer {

    public static List<Character> convertArrayIntoList(char[] array) {
        List<Character> list = new ArrayList<>();
        for (char ch : array) {
            list.add(ch);
        }
        return list;
    }

    public static Map<Character, Integer> countChars(List<Character> list, boolean sortByValue) {
        Map<Character, Integer> map = new TreeMap<>();
        for (Character ch : list) {
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        if (sortByValue) {
            map = map.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        }
        return map;
    }


}
