package externalization;

import java.io.*;

class Person implements Externalizable{

    //Необходим дефолтный конструктор для работы ЭКСТАРНАЛИЗАЦИИ,
    // без него не будет записи и чтения
    public Person(){
    }


    String name;
    String surname;
    int age;
    transient int tel;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(age);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = (int) in.readObject();

    }
}
