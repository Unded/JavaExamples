package workhome.find_number_of_element_in_list;

import java.util.Arrays;
import java.util.List;

public class FindNumberOfElementInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Y", "X", "X", "+", "Y", "X", "X", "X");
        System.out.println(/*foundElementsInListForLoop(list, "X", 5) & foundElementsInListForLoop(list, "Y", 2) & */!foundElementsInListForLoop(list, "-", 2));
        System.out.println(foundElementsInListForEachLoop(list, "Y", 3));
    }

    //Ищет заднное количество элементов, но не более.
    //Если элементов больше чем надо - это не ошибка.
    private static boolean foundElementsInListForLoop(List<String> list, String element, int count) {
        boolean result = false;
        List<String> sublist = list;
        for (int i = 1; i <= count; i++) {
            if (sublist.contains(element)) {
                int elementIndex = sublist.indexOf(element);
                System.out.println("Sublist: " + sublist + " Element #" + elementIndex);
                sublist = sublist.subList(elementIndex + 1, sublist.size());
                result = true;
            } else {
                System.out.println("Sublist: " + sublist + " No such element in List");
                return false;
            }
        }
        return result;
    }

    //Метод находит все элементы в Листе.
    //Если элементов больше чем надо - это не ошибка.
    private static boolean foundElementsInListForEachLoop(List<String> list, String element, int count) {
        int actualCount = 0;
        for (String value : list) {
            actualCount += element.equals(value) ? 1 : 0;
        }
        return count == actualCount || count <= actualCount;
    }
}
