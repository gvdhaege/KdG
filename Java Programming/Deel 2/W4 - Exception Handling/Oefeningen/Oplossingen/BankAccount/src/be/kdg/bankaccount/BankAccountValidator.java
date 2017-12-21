package be.kdg.bankaccount;

public class BankAccountValidator {
    /*
     In deze methode wordt het volgende onderzocht:
        1) Heeft het rekeningnummer exact 12 cijfers
        2) Bevat het geen vreemde tekens
        3) Is het een geldig nummer (via de afzonderlijke methode isGeldigNummer)
     */
    public static void validateAccount(String account) throws BankAccountException {
        if (account.length() != 12) {
            throw new BankAccountException("BankAccount must have 12 digits");
        }
        try {
            Long.parseLong(account);
        }
        catch (NumberFormatException e) {
            throw new BankAccountException("Wrong string, must be numeric");
        }
        if (!isGeldigNummer(account)) {
            throw new BankAccountException("Wrong accountnumber");
        }
    }

    /*
     De geldigheid van een bankrekeningnummer wordt bepaald door het controlegetal (de 2 laatste cijfers).
     Dit bekom je door de restdeling te doen van de 10 voorafgaande cijfers met 97. Het controlegetal is dan het
     getal dat je bekomt, behalve bij rest = 0, dan wordt het de waarde 97.
     */
    public static boolean isGeldigNummer(String account) {
        long eigenlijkNummer = Long.parseLong(account.substring(0, 10));
        int controleGetal = Integer.parseInt(account.substring(10, 12));
        if (eigenlijkNummer % 97 == 0) {
            return controleGetal == 97;
        }
        return (eigenlijkNummer % 97) == controleGetal;
    }

}
