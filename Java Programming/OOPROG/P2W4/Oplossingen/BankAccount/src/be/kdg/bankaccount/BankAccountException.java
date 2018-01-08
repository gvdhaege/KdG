package be.kdg.bankaccount;

/*
 Niet echt zinvol, maar maak een nieuwe checked Exception klasse met de naam BankAccountException.
 Voorzie alle 4 mogelijke constructors
 */

public class BankAccountException extends Exception {
    public BankAccountException() {
    }

    public BankAccountException(String message) {
        super(message);
    }

    public BankAccountException(Throwable cause) {
        super(cause);
    }

    public BankAccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
