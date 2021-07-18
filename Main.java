package by.minsk.itakademy.arturzimin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        Class maineClass=Man.class;


        for (Constructor constructor : maineClass.getDeclaredConstructors()) {
            System.out.println("Constructor = "+constructor);
        }
        for (Field field:maineClass.getDeclaredFields()){
            System.out.println("Field = "+field);
        }
        for (Method method:maineClass.getMethods()){

            System.out.println("Methods = "+method);
        }
        Method method=maineClass.getMethod("getName",null);
        Method method1=maineClass.getMethod("getAge",null);

    }
}
