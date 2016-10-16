package workhome.equivalent;

import java.util.HashSet;
import java.util.Set;

public class AnagrammHS {
    private final String value;

    public AnagrammHS(String value) {
        this.value = value.toLowerCase();
    }

    @Override
    public boolean equals(Object obj) {
        String str = (String) obj;
        str = str.toLowerCase();
        char[] swapArr = str.toCharArray();

        char[] objCharArr = value.toCharArray();
        Set<Character> data = new HashSet<>();

        for (char ch : objCharArr){
            data.add(ch);
        }
        boolean result = false;
        boolean loopEnd = true;
        while (loopEnd) {
            for (int i = 0; i < swapArr.length; i++) {
                if (data.contains(swapArr[i])){
                    continue;
                }else{
                    return false;
                }
            }
            result = true;
            loopEnd = false;
        }
        return result;
    }
}
