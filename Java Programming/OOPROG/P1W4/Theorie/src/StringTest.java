/**
 * @author Steven Excelmans
 * @version 1.0 9/10/2017 19:34
 */
public class StringTest {
    public static void main(String[] args) {

        String een = "abc";
        String twee = "abc";
        String drie = new String("abc");

        System.out.println(een == twee);
        System.out.println(een == drie);
        System.out.println(twee == drie);

        System.out.println(een.equals(twee));
        System.out.println(een.equals(drie));
        System.out.println(twee.equals(drie));
    }
}
