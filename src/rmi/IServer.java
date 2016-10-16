package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.rmi.server.UnicastRemoteObject;

//Для возможноти использовать RMI
//должен быть интерфейс расширяющий класс REMOTE
public interface IServer extends Remote {

    default String sayHello(String name)throws RemoteException{

        String str = "Hello, " + name + "! It is " + System.currentTimeMillis() + " ms now";
        try {
            System.out.println(name + " from " + UnicastRemoteObject.getClientHost());
        } catch (ServerNotActiveException e) {
            System.out.println(e.getMessage());
        }
        if ("Killer".equals(name)) {
            System.out.println("Shutting down...");
            System.exit(1);
        }
        return str;
    }
}
