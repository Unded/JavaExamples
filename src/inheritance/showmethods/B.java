package inheritance.showmethods;

public class B extends A {
    int k;

    B(int ii, int jj, int kk){
        super(ii, jj);
        k = kk;
    }
//    // Метод переопределен, логика полностью изменена
//    @Override
//    void show(){
//        System.out.println("k = " + k);
//    }


   // Метод переопределен и дополнен новой логикой
    @Override
    void show() {
        super.show();
        System.out.println("k = " + k);
    }
}
