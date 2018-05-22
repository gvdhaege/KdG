import java.lang.reflect.*;
import java.lang.annotation.Annotation;

public class ParserClass {
    public static void execute(Class<?> aClass) {
        try {
            Object anObject = aClass.newInstance();

            for (Method method : aClass.getDeclaredMethods()) {
                Kleur kleurAnnot = method.getAnnotation(Kleur.class);
                if (kleurAnnot != null) {
                		Method getKleur = aClass.getMethod("setKleur",String.class);
                		if (getKleur != null){
                			getKleur.invoke(anObject,kleurAnnot.value());
										}
                    method.invoke(anObject);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}


