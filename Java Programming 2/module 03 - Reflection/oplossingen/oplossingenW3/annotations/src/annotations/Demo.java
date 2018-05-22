package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
	public void demoMethode() {
		MijnKlasse mijnKlasse = new MijnKlasse();
		// TODO: Toon alle annotaties op de klasse MijnKlasse.
		toonClassAnnotations(mijnKlasse);
		// TODO: Toon de waarden van de Class-annotaties
		toonWaardenClassAnnotation(mijnKlasse);
		// TODO: Toon alle annotaties voor demoMethode uit MijnKlasse .
		toonMethodeAnnotations(mijnKlasse);
		//TODO:  Toon alle waarden van de Methode-annotaties uit MijnKlasse
		toonWaardenMethodeAnnotation(mijnKlasse);
	}

	private void toonWaardenMethodeAnnotation(MijnKlasse object) {
		for (Method method : object.getClass().getDeclaredMethods()) {
			for (Annotation annotation : method.getAnnotations()) {
				toonWaardenAnnotatie(annotation);
			}
		}
	}

	private void toonMethodeAnnotations(MijnKlasse object) {
		for (Method method : object.getClass().getDeclaredMethods()) {
			System.out.println("Alle annotaties voor methode " + method.getName());
			for (Annotation annotation : method.getAnnotations()) {
				System.out.println(annotation);
			}
		}
	}

	private void toonWaardenClassAnnotation(MijnKlasse object) {
		for (Annotation annotation : object.getClass().getAnnotations()) {
			toonWaardenAnnotatie(annotation);
		}
	}

	/**
	 * onderaan deze klasse een eenvoudiger varianten van deze methode,
	 * die ervan uitgaat dat je op voorhand weet welke annotatie je zoekt
	 * @param annotation
	 */
	private void toonWaardenAnnotatie(Annotation annotation) {
		System.out.println("Alle parameters voor annotatie " + annotation.annotationType().getSimpleName());
		// annotatie attributen zijn gedeclareerd als methoden in een interface!
		for (Method method : annotation.annotationType().getDeclaredMethods()) {
			try {
				// annotatie waarden worden verkregen door de annotatie aan te roepen als
				// methoden in een interface!
				System.out.println("\t" + method.invoke(annotation));
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

	public void toonClassAnnotations(MijnKlasse object) {
		System.out.println("Alle annotaties voor klasse " + object.getClass().getSimpleName());
		for (Annotation annotation : object.getClass().getAnnotations()) {
			System.out.println(annotation);
		}
	}


	/**
	 * toonWaardenMethodeAnnotation kan ook eenvoudiger als je exact weet welke annotaties
	 * je
	 * zoekt
	 * @param mijnKlasse
	 */
	private void toonStatischeWaardenMethodeAnnotation(MijnKlasse mijnKlasse) {
		System.out.println("\nAlle parameters:");
		for (Method method : MijnKlasse.class.getDeclaredMethods()) {
			MijnAnnotatie mijn = method.getAnnotation(MijnAnnotatie.class);
			if (mijn != null) {
				System.out.println(mijn.string() + " " + mijn.waarde());
			}
			Wat wat = method.getAnnotation(Wat.class);
			if (wat != null) {
				System.out.println(wat.omschrijving());
			}
		}
	}

	/**
	 * toonWaardenClassAnnotation kan ook eenvoudiger als je exact weet welke annotaties je
	 * zoekt
	 * @param mijnKlasse
	 */
	private void toonStatischeWaardenClassAnnotation(MijnKlasse mijnKlasse) {
		System.out.println("\nAlle parameters:");
		for (Annotation an : MijnKlasse.class.getAnnotations()) {
			if (an instanceof MijnAnnotatie) {
				System.out.print(((MijnAnnotatie) an).string() + " ");
				System.out.println(((MijnAnnotatie) an).waarde());
			} else if (an instanceof Wat) {
				System.out.println(((Wat) an).omschrijving());
			}
		}


	}
}