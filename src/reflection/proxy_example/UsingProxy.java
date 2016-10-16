package reflection.proxy_example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class UsingProxy {
    public static void main(String[] args) {
        List<String> list = (List<String>) Proxy.newProxyInstance(
                null,
                new Class[]{List.class},
                //Anonymous Class
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //Using Lambda
                (proxy, method, args1) -> {
                    switch (method.getName()) {
                        case "add":
                            return true;
                        case "get":
                            return "Get using";
                        case "size":
                            return -5;
                        case "indexOf":
                            return 155;
                        default:
                            throw new UnsupportedOperationException();
                    }
                });
        System.out.println(list.add("A"));
        System.out.println(list.indexOf("A"));
        System.out.println(list.get(0));
        System.out.println(list.size());
    }
}
