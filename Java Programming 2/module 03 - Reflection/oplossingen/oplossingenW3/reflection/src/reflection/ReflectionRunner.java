package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionRunner {
    public static void reflect(Class myClass) {
        try {
            Object object = myClass.newInstance();
            System.out.println("Voor reflection: " + object);
            for (Method method : myClass.getDeclaredMethods()) {
                System.out.print(method.getName() + " ");
                for (Annotation annotation : method.getAnnotations()) {
                    if (annotation instanceof Changeable) {
                        method.invoke(object, "Jan de Rijke");
                    }
                }
            }
            System.out.println("\nNa reflection: " + object);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

/*
Voor reflection: Titel: "Onbekend" (Anoniem) €0,00
equals toString hashCode getAuteur setAuteur getPrijs getTitel
Na reflection: Titel: "Onbekend" (Jan de Rijke) €0,00
*/