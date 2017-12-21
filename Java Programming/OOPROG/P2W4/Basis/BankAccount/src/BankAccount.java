public class BankAccount {
    private String account;

    public BankAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return account.substring(0,3) + "-"
                + account.substring(3,10) + "-"
                + account.substring(10,12);
    }
}
