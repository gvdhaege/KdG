/**
 * @author Steven Excelmans
 * @version 1.0 9/10/2017 19:37
 */
public class StringManipulatie {
    public static void main(String[] args) {

//        String tekst = "For shizzle my nizzle!";
        String tekst = "The quick brown fox jumps over the lazy dog";

        System.out.println(tekst.toUpperCase());
        System.out.println(tekst.toLowerCase());
        System.out.println(tekst.replace('i','a'));
        System.out.println(tekst.length());

        String lettersE = "";
        for (int i = 0; i < tekst.length() ; i++) {
            if(tekst.charAt(i) == 'i'){
                lettersE += tekst.charAt(i);
            }
        }
        System.out.println(lettersE);
        System.out.println(tekst.charAt(0));
        System.out.println(tekst.charAt(tekst.length() - 1));
    }
}
