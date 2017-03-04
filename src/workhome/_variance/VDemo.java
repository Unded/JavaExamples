package workhome._variance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VDemo {

    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Double> dList = new ArrayList<>(Arrays.asList(1.0, 2.1, 3.2, 4.3));
        getFirstNumber(iList);
        getFirstNumber(dList);

        List<Number> nList = new ArrayList<>(Arrays.asList(4.3, 3.2, 2.1));
        List<Object> oList = new ArrayList<>(Arrays.asList(4.3, "Hi all!!", 2.1));
        addStringData(nList);
        addStringData(oList);

    }

    /**
     * КОНТРВАРИАНТНОСТЬ - обычно исп. для записи в коллекцию.
     * <p>
     * (если в коллекцию будут записаны потомки, это может привести к ошибке,
     * когда у элемента-потомка будет вызван метод, отсутствующий у предка)
     * <p>
     * Метод ожидает List из элементов типа:
     * ПРЕДКОВ/РОДИТЕЛЕЙ (Object) для Number
     * или Number.
     * Integer или Double не подходят.
     */
    static void addStringData(final List<? super Number> list) {
        final List<Object> trash = new ArrayList<>(list);
        System.out.println(trash);
    }


    /**
     * КОВАРИАНТНОСТЬ - обычно исп. для чтения из коллекции.
     * <p>
     * (если в коллекцию будут записаны предки,
     * это может привести к ошибке, приведения типов)
     * <p>
     * Метод ожидает List из элементов типа:
     * ПОТОМКОВ/ДЕТЕЙ (Integer, Double, ...) для Number
     * или Number.
     * Object не подходит.
     */
    static void getFirstNumber(final List<? extends Number> list) {
        final Number number = list.get(0);
        System.out.println(number);
    }
}
