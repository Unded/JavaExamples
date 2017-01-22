package workhome.to_make_deep_clone_object.serialization;

import java.io.*;

public class StreamDeepCopy {
    public static void main(String[] args) {
        User userOriginal = new User(18, "Kirill");
        System.out.println(userOriginal);

        User userCopy = (User) makeCopy(userOriginal);
        System.out.println(userCopy);
    }

    private static Object makeCopy(Object userOriginal) {
        Object copy = null;
        try (
                //Создаем поток для записи массива байт
                ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
                //Создаем поток для сериализации (записи) массива байт
                ObjectOutputStream objectOut = new ObjectOutputStream(byteArrayOut)) {

            //Пишим ОРИГИНАЛ ОБЪЕКТА в поток (сериализуем)
            objectOut.writeObject(userOriginal);
            //Принудительно "проталкиваем", чтоб не завис в буффере и т.п.
            objectOut.flush();

            //Создаем поток для чтения массива байт и читаем из потока записи байты
            ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(byteArrayOut.toByteArray());
            //Создаем поток для десериализации (чтения объекта из потока) массива байт
            ObjectInputStream objectIn = new ObjectInputStream(byteArrayIn);

            //Читаем объект
            copy = objectIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return copy;
    }

}
