package workhome.equivalent;

import java.util.*;

public class AnagrammArrSort {
    Map<String, Set<String>> wordsMap = new HashMap<>();
    Set<String> wordsSet = new HashSet<>();

    private final String value;

    public AnagrammArrSort(String value) {
        this.value = value.toLowerCase();
    }

    @Override
    public boolean equals(Object obj) {
        String str = (String) obj;
        str = str.toLowerCase();
        char[] swapArr = str.toCharArray();
        Arrays.sort(swapArr);
        char[] dataArr = value.toCharArray();
        Arrays.sort(dataArr);
        boolean result = Arrays.equals(dataArr, swapArr);
        if (result) {
            wordsSet.add(str);
            wordsMap.put(value, wordsSet);
        }
        System.out.println(wordsMap);
        return result;
    }
}
