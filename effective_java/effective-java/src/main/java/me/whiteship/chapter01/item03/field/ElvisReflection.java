package me.whiteship.chapter01.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {
    public static void main(String[] args) {
        try {
            Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            Elvis.INSTANCE.sing();
            Elvis elvis1 = declaredConstructor.newInstance();
            Elvis elvis2 = declaredConstructor.newInstance();
            System.out.println(elvis1 == elvis2);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
