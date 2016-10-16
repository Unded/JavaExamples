package workhome.fact.loop;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        int fact = 1;
        int n = 6;

        for (int i = 2; i <= n; i++){
            fact = i * fact;
            System.out.println(i + " = " + fact);
        }

    }

}
