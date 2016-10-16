package inheritance.showmethods;

public class A {
    int i;
    int j;

    A(int ii, int jj){
        i = ii;
        j = jj;
    }
    void show(){
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
