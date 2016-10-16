package workhome.stack;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Stack{

    Integer element;
    ArrayList<Integer> expandedArr;

    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void push(Integer elmt){
        expandedArr = new ArrayList<>();
        element = elmt;
        arrayList.add(element);
        System.out.println(arrayList);
    }

    public void pop(){
        arrayList.remove(arrayList.size() - 1);
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        Stack xxx = new Stack();
        xxx.push(10);
        xxx.push(9);
        xxx.push(8);
        xxx.push(7);
        xxx.push(6);
        xxx.push(5);
        xxx.push(4);
        xxx.push(3);
        xxx.push(2);
        xxx.push(1);
        xxx.pop();
        xxx.pop();
        xxx.pop();
        xxx.pop();
        xxx.pop();
        xxx.pop();
        xxx.pop();
        xxx.pop();
        xxx.pop();
        int a = 0, b = 3;
        System.out.println(a > b ? "a > b" : "a < b");

        System.out.println(a/b);
        Boolean bb = new Boolean("true");
        System.out.println(bb);

        Integer aaa = 10;
        Integer bbb = 10;
        System.out.println("\u005B");
        System.out.println(aaa == 10);
        System.out.println(5^1);
    }
}
