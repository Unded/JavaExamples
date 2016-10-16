package reflection.virtual_method;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {
    int a = 1;
    int b = 2;
    int c = 3;



    Map<String, String> getClassFields() {
        Map<String, String> data = new HashMap<>();
        List<Field> allFields = Arrays.asList(this.getClass().getDeclaredFields());
        fieldsToMap(data, allFields);
        return data;
    }


    Map<String, String> getSuperClazzFields() {
        Class clazz = this.getClass();
        Class superClazz = clazz.getSuperclass();
        Map<String, String> data = new HashMap<>();
        List<Field> allFields = Arrays.asList(superClazz.getDeclaredFields());
        if (allFields.size() == 0) {
            return data;
        } else {
            fieldsToMap(data, allFields);
            return data;
        }
    }

    Map<String, String> getClazzTreeFields(Class clazz, Class superClazz, HashMap<String, String> data) {
        if (clazz.getName().equals(superClazz.getName()))
            return data;
        else {
            getClazzTreeFields(clazz.getSuperclass(), superClazz, data);
        }
        Map<String, String> fieldsMap = new HashMap<>();
        List<Field> allFields = Arrays.asList(clazz.getDeclaredFields());
        fieldsToMap(fieldsMap, allFields);
        data.putAll(fieldsMap);
        return data;
    }

    void fieldsToMap(Map<String, String> data, List<Field> allFields) {
        allFields.forEach(x -> {
            try {
                //Get access to private field
                x.setAccessible(true);
                data.put(x.getName(), "" + x.get(this));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }
}
