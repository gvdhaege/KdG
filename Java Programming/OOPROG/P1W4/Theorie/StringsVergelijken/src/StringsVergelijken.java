public class StringsVergelijken {
    public static void main(String[] args) {
        String literal = "Jean-Pierre";
        String nieuweReferentie = "Jean-Pierre";
        String nieuwObject = new String("Jean-Pierre");

        System.out.println(literal == nieuweReferentie); //true
        System.out.println(literal == nieuwObject); //false
        System.out.println(literal.equals(nieuweReferentie)); //true
        System.out.println(literal.equals(nieuwObject)); //true
    }
}
