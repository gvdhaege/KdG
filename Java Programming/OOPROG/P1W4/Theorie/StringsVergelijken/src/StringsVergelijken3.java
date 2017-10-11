public class StringsVergelijken3 {
    public static void main(String[] args) {
        String stringEen = "java";
        String stringTwee = "Java";
        String stringDrie = "JAVA";

        if (stringEen.equalsIgnoreCase(stringTwee)){
            System.out.printf("%s en %s zijn gelijk", stringEen, stringTwee);
        }
        if (stringEen.equalsIgnoreCase(stringDrie)){
            System.out.printf("%n%s en %s zijn gelijk", stringEen, stringDrie);
        }
        if (stringTwee.equalsIgnoreCase(stringDrie)){
            System.out.printf("%n%s en %s zijn gelijk", stringTwee, stringDrie);
        }
    }
}
