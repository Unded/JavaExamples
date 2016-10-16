package recurs;

public class Recurs {
    int values[];

    Recurs(int i){
        values = new int[i];
    }

    void printArr(int i){
        if (i == 0) return;
        else printArr(i - 1);
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }
}
