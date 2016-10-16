package workhome.fact.recurs;

public class Recurs {

    private int fact = 1;


    void findFact(int i){

        if (i == 0) return;
        else findFact(i - 1);
        fact = fact * i;
        System.out.println(i + "! = " + fact);
    }

}
