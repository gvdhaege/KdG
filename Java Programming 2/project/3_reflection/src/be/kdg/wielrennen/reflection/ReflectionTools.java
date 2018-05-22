package be.kdg.wielrennen.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTools {
    public static void classAnalysis(Class aClass) {
        System.out.println("Analyse van de klasse: " + aClass.getSimpleName());
        System.out.println("==================================================");
        System.out.printf("%-25s : %s\n", "Fully qualified name", aClass.getName());
        System.out.printf("%-25s : %s\n", "Naam van de superklasse", aClass.getSuperclass());
        System.out.printf("%-25s : %s\n", "Naam van de package", aClass.getPackage());
        System.out.printf("%-10s : %s\n", "Interfaces", getValues(aClass.getInterfaces()));
        System.out.printf("%-10s : \n%s\n", "Constructors", getValues(aClass.getConstructors()));
        System.out.printf("%-15s : %s\n", "attributen", getValues(aClass.getDeclaredFields()));
        System.out.printf("%-15s : %s\n", "getters", getMethods(aClass, "get"));
        System.out.printf("%-15s : %s\n", "setters", getMethods(aClass, "set"));
        System.out.printf("%-15s : %s\n", "andere methoden", getOtherMethods(aClass));
        System.out.println();
    }

    public static <T> Object runAnnotated(Class<T> aClass) {
        try {
            Constructor<T> constructor = aClass.getDeclaredConstructor();
            Object object = constructor.newInstance();

            for (Method method : aClass.getMethods()) {
                CanRun canRun = method.getAnnotation(CanRun.class);
                if (canRun != null) {
                    method.invoke(object, "dummy");
                }
            }
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static <E> String getValues(E[] collection) {
        StringBuilder temp = new StringBuilder();
        for (E e : collection) {
            if (e instanceof Constructor) {
                temp.append("\t").append(e).append("\n");
            } else if (e instanceof Class) {
                temp.append(((Class) e).getSimpleName());
            } else if (e instanceof Field) {
                temp.append(((Field) e).getName()).append(" ");
            }
        }
        return temp.toString();
    }

//    replaced by generic getValues method

//    private static String getConstructors(Class aClass) {
//        StringBuilder temp = new StringBuilder();
//        for (Constructor constructor : aClass.getConstructors()) {
//            temp.append("\t").append(constructor).append("\n");
//        }
//        return temp.toString();
//    }
//
//    private static String getInterfaces(Class aClass) {
//        StringBuilder temp = new StringBuilder();
//        for (Class interfaces : aClass.getInterfaces()) {
//            temp.append(interfaces.getSimpleName());
//        }
//        return temp.toString();
//    }
//
//    private static String getFields(Class aClass) {
//        StringBuilder temp = new StringBuilder();
//        for (Field field : aClass.getDeclaredFields()) {
//            temp.append(field.getName()).append(" ");
//        }
//        return temp.toString();
//    }

    private static String getMethods(Class aClass, String prefix) {
        StringBuilder temp = new StringBuilder();
        for (Method method : aClass.getDeclaredMethods()) {
            if (method.getName().startsWith(prefix)) {
                temp.append(method.getName()).append(" ");
            }
        }
        return temp.toString();
    }

    private static String getOtherMethods(Class aClass) {
        StringBuilder temp = new StringBuilder();
        for (Method method : aClass.getDeclaredMethods()) {
            if (!method.getName().startsWith("get") && !method.getName().startsWith("set")) {
                temp.append(method.getName()).append(" ");
            }
        }
        return temp.toString();
    }
}
