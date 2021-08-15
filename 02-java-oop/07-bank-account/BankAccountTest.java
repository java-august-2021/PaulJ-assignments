public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount paul = new BankAccount();
        paul.setName("Paul Jansen");
        System.out.println(paul.getName());
        System.out.println(paul.getCheckingBalance());
        System.out.println(paul.getSavingsBalance());
        paul.depositCheckingMoney(100);
        System.out.println(paul.getCheckingBalance());
        paul.withdrawCheckingMoney(50);
        System.out.println(paul.getCheckingBalance());
        paul.withdrawCheckingMoney(60);
        System.out.println(paul.getCheckingBalance());
        paul.depositSavingsMoney(1000);
        System.out.println(paul.getSavingsBalance());
        paul.withdrawSavingsMoney(500);
        System.out.println(paul.getSavingsBalance());
        paul.totalBalance();

    }
}
