
public class DemoSpeedTest
{
    public static void main(String[] args)
    {
        // We gaan de SpeedTest uitvoeren met telkens 100 000 willekeurige getallen
        SpeedTest speedTest = new SpeedTest(100000);

        SpeedTestResult resultaatVooraanToevoegen = speedTest.testInsertFirst();
        System.out.println(resultaatVooraanToevoegen.toString());

        SpeedTestResult resultaatAchteraanToevoegen = speedTest.testInsertLast();
        // toString is niet nodig, wordt automatisch opgeroepen omdat println een string verwacht
        System.out.println(resultaatAchteraanToevoegen);

        // In aparte variabele het resultaat bijhouden is ook niet nodig...
        System.out.println(speedTest.testDeleteFirst());
        System.out.println(speedTest.testGet());
        System.out.println(speedTest.testSorteren());
    }

}
