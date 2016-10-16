package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String... args) throws Exception {

        //Клиент получает "РЕГИСТРАЦИЮ"
        Registry registry = LocateRegistry.getRegistry("localhost", 2099);

        //"Сервис" ищет регистрацию с названием "sample/HelloService"
        IServer service = (IServer) registry.lookup("sample/HelloService");

        String[] names = {"John", "Jan", "Иван", "Johan", "Hans", "Bill", "Kill"};
        for (String name : names) {
            //Клиет, после получения ЗАГЛУШКИ", изскользует метод,
            //определенный на сревер, как-будто он его собственный.
            //А все вычисления происходят на сервер
            System.out.println(service.sayHello(name));
        }
    }
}
