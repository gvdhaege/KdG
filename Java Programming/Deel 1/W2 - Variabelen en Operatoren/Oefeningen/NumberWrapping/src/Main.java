public class Main
{

    public static void main(String[] args)
    {
        // Een short is 2 bytes groot (zie slide 8).
        // Elk getaltype heeft dus een vooraf vastgelegd bereik.
        // Als je over de grenzen van dat bereik gaat, in de 2 richtingen -> foute waarden.
        short number = 0;
        System.out.println("1. number = " + number);

        number = -32768;
        System.out.println("2. number = " + number);

        // Compiler klaagt ! Cast naar short.
        // number = -32769;
        number = (short) -32769;
        System.out.println("3. number = " + number);

        number = 32767;
        System.out.println("4. number = " + number);

        // Compiler klaagt ! Cast naar short.
        number = (short) 32768;
        System.out.println("5. number = " + number);
    }
}
