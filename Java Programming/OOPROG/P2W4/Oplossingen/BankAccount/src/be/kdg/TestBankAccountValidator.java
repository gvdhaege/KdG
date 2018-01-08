package be.kdg;

import be.kdg.bankaccount.BankAccount;
import be.kdg.bankaccount.BankAccountException;
import be.kdg.bankaccount.BankAccountValidator;

/**
 * Werk de klassen BankAccountValidator en BankAccountException uit, volgens
 * onderstaande aanwijzingen.
 */

public class TestBankAccountValidator {
    public static void main(String[] args) {
        String[] numbers = {
                "409407376196", "730004200601",  // geldige nummers
                "12345678901", "abcdefghijkl", "123456789012", "000000009700"};
        for (String accountNumber : numbers) {
            try {
                BankAccountValidator.validateAccount(accountNumber);
                BankAccount account = new BankAccount(accountNumber);
                System.out.println(accountNumber + " accepted: " + account);
            } catch (BankAccountException e) {
                System.out.println(accountNumber + " NOT accepted: " + e);
            }
        }
    }
}

/* Verwachte uitvoer:
409407376196 accepted: 409-4073761-96
730004200601 accepted: 730-0042006-01
12345678901 NOT accepted: bankaccount.BankAccountException: BankAccount must have 12 digits
abcdefghijkl NOT accepted: bankaccount.BankAccountException: Wrong string, must be numeric
123456789012 NOT accepted: bankaccount.BankAccountException: Wrong accountnumber
000000009700 NOT accepted: bankaccount.BankAccountException: Wrong accountnumber
*/
