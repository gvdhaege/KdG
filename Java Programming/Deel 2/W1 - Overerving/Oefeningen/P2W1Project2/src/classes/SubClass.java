package classes;

// SubClass erft over van SuperClass.

public class SubClass extends SuperClass
{
    // De subclass overrides de method van de superclass.
    // Roept eerst de method van de superclass aan, keyword 'super'.
    // Deze method doet daarna zijn ding op subclass niveau.

    @Override
    public void printMethod()
    {
        super.printMethod();                        // Gebruik van super.
        System.out.println("\tSUBCLASS : printMethod");
    }
}
