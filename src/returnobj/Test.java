package returnobj;

public class Test {

    int a;

    Test(int i){
        a = i;
    }

    Test incTen(){
        Test temp = new Test(a + 10);
    return temp;
    }
}
