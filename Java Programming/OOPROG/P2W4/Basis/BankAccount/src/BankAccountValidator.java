public class BankAccountValidator {
    public static void validateAccount(String account) throws BankAccountException {
        if (account.length() != 12) {
            throw new BankAccountException("Account must have 12 numbers");
        }
        try {
            Long.parseLong(account);
        } catch (NumberFormatException e) {
            throw new BankAccountException("Account can only contain numbers");
        }
        if (!isGeldigNummer(account)) {
            throw new BankAccountException("Account is not a valid number");
        }
    }

    static boolean isGeldigNummer(String account) {
        long nummer = Long.parseLong(account.substring(0, 10));
        int controleGetal = Integer.parseInt(account.substring(10, 12));
        if (nummer % 97 == 0) {
            return controleGetal == 97;
        }
        return (nummer % 97) == controleGetal;
    }
}