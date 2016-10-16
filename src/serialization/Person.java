package serialization;

import java.io.Serializable;

class Person implements Serializable{


    String name;
    String surname;
    int age;
    transient int tel;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", tel=" + tel +
                '}';
    }
}
