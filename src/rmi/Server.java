package rmi;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements IServer {

    //НАЗВАНИЕ ЗАГЛУШКИ
    private static final String BINDING_NAME = "sample/HelloService";

    public static void main(String... args) throws Exception {
        System.out.print("Starting registry...");

        //Создание "РЕГИСТРАТУРЫ" (сюда обращается клиент для получения
        //информации о сервере (IP и PORT)
        final Registry registry = LocateRegistry.createRegistry(2099);
        System.out.println(" OK");

        //Сервер возвращает ЗАГЛУШКУ (STUB) клиенту,
        //чтоб клиент мог пользоваться методами, реализованными на сервере,
        //а именно описаными в итерфейсе, который расширяет класс Remote
        //и реализованными в данном классе
        //(в данном случае метод в интерфейсе определен по умолчанию)

        final IServer service = new Server();
        //Экспортируем "СЕРВЕРНЫЙ" (удаленный) объект,
        //для приема входящих вызовов по определенному порту
        Remote stub = UnicastRemoteObject.exportObject(service, 0);

        System.out.print("Binding service...");
        //"РЕГИСТРАТУРУ" связывают с ЗАГЛУШКОЙ и присваивают НАЗВАНИЕ
        registry.bind(BINDING_NAME, stub);
        System.out.println(" OK");

        while (true) {
            Thread.sleep(Integer.MAX_VALUE);
        }
    }

}
