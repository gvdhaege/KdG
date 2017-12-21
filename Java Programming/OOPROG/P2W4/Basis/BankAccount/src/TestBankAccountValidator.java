public class TestBankAccountValidator {
    public static void main(String[] args) {
        String[] numbers = {
                "409407376196", "730004200601", // geldige nummers
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