package main;

import exceptions.IOExceptionDemo;

public class TestClass
{
    public static void main(String[] args)
    {
        IOExceptionDemo ioExceptionDemo = new IOExceptionDemo();

        // ioExceptionDemo.showLines();

        ioExceptionDemo.processLines();

        ioExceptionDemo.printHints();
        ioExceptionDemo.printSolutions();
    }
}
