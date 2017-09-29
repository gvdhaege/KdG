/**
 * @author Steven Excelmans
 * @version 1.0 29/09/2017 17:32
 */
public class Operatoren {

    public static void main(String[] args) {

        int miljardEen = 2000000000;
        int miljardTwee = 2000000000;

        long som = (long) miljardEen + miljardTwee;

        System.out.println(som);

        long tienduizendEen = 10000;
        long tienduizendTwee = 10000;

        int result =  (int) tienduizendEen + (int) tienduizendTwee;
        System.out.println(result);

        int eerste = 8;
        int tweede = 5;

        System.out.println(eerste + tweede);
        System.out.println(eerste - tweede);
        System.out.println(eerste * tweede);
        System.out.println(eerste / tweede);
        System.out.println(eerste % tweede);

        int resultTwee;

        resultTwee = ++eerste;
        System.out.println(resultTwee); //9
        System.out.println(eerste); //9
        System.out.println(tweede); //5

        resultTwee = eerste++;
        System.out.println(resultTwee); //9
        System.out.println(eerste); //10
        System.out.println(tweede); //5

        resultTwee = --tweede;
        System.out.println(resultTwee); //4
        System.out.println(eerste); //10
        System.out.println(tweede); //4

        resultTwee = tweede--;
        System.out.println(resultTwee); //4
        System.out.println(eerste); //10
        System.out.println(tweede); //3

    }
}
