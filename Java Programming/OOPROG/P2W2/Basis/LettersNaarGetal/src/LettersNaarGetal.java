public class LettersNaarGetal {
    private static String[] cijfers = {
            "nul", "een", "twee", "drie", "vier",
            "vijf", "zes", "zeven", "acht", "negen"
    };
    public static long zetOm(String string) {
        long waarde = 0;

        String temp = string.trim().toLowerCase();
        String[] karakters = temp.split(" ");

        for (String str : karakters){
            for (int i = 0; i < cijfers.length; i++) {
                if (str.equals(cijfers[i])){
                    waarde = waarde * 10 + i;
                }
            }
        }
        return waarde;
    }
}