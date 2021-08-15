public class BankAccount {
    private String name;
    private int checkingAccount = 0;
    private int savingsAccount = 0;
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public BankAccount() {
        numberOfAccounts++;
        System.out.println(numberOfAccounts);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void checkingAccount(){
        System.out.println(checkingBalance);
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public void savingsAccount() {
        System.out.println(savingsBalance);
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public void depositCheckingMoney(double money){
        checkingBalance += money;
    }

    public void depositSavingsMoney(double money) {
        savingsBalance += money;
    }

    public void withdrawCheckingMoney(double money) {
        if (checkingBalance < money) {
            System.out.println("You broke sucka!");
        }
        else {
            checkingBalance -= money;
            System.out.println("Yay, you can eat today!");
        }

    }

    public void withdrawSavingsMoney(double money) {
        if (savingsBalance < money) {
            System.out.println("You broke sucka!");
        }
        else {
            savingsBalance -= money;
            System.out.println("Yay, for future monies you can't spend!");
        }
    }

    public void totalBalance () {
        System.out.println(checkingBalance + savingsBalance);
    }
}