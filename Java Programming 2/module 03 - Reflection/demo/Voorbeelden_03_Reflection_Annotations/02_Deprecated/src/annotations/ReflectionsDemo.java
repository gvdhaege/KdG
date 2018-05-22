package annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionsDemo {
    public static void main(String[] args) {
        Class<Punt> puntClass = Punt.class;
        Class<RuimtePunt> ruimtePuntClass = RuimtePunt.class;
        List<Method> deprecatedMethods = new ArrayList<>();

        for (Method method : puntClass.getMethods()) {
            Deprecated deprecated = method.getAnnotation(Deprecated.class);
            if (deprecated != null) {
                deprecatedMethods.add(method);
            }
        }

        for (Method method : ruimtePuntClass.getMethods()) {
            Deprecated deprecated = method.getAnnotation(Deprecated.class);
            if (deprecated != null) {
                deprecatedMethods.add(method);
            }
        }

        for (Method deprecatedMethod : deprecatedMethods) {
            System.out.print(deprecatedMethod.getName() + " ");
        }
    }
}
