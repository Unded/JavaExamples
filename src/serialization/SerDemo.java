package serialization;

import java.io.*;

public class SerDemo {

    public static void main(String[] args) {


        Person p1 = new Person();
        p1.age = 30;
        p1.name = "P1";
        p1.surname = "PS1";
        p1.tel = 1234567;

        //Сериализовать данные и записть в файл
        try (FileOutputStream serFile = new FileOutputStream("test.ser");
             ObjectOutputStream objOut = new ObjectOutputStream(serFile)) {

            objOut.writeObject(p1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Something wrong..." + e);
        }

        //Открыть файл и десериализовать данные
        //Если данные переданы на другую ДжаваВиртМашин, на машинах должны быть
        //одинаковые версии класса Person
        try(FileInputStream serReadFile = new FileInputStream("test.ser");
            ObjectInputStream objIn =new ObjectInputStream(serReadFile)){

            Person bestPer = (Person) objIn.readObject();
            System.out.println(bestPer);

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Something wrong..." + e);
        }

    }
}
