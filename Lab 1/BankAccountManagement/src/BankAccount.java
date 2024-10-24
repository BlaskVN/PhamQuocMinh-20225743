import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private String accountHolderName;
    private double balance;
    private double monthlyInterestRate;
    private int withdrawalCount;
    private static final int MAX_WITHDRAWALS = 3;
    private ArrayList<String> transactionHistory;

    public BankAccount(String accountHolderName, double initialBalance, double monthlyInterestRate) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.withdrawalCount = 1;
        this.transactionHistory = new ArrayList<>();
        logTransaction("Số dư ban đầu", initialBalance);
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Đã gửi " + amount + "VND");
            logTransaction("Deposit", amount);
        } else {
            System.out.println("Số tiền không hợp lệ");
        }
    }

    public void withdraw(double amount){
        if(withdrawalCount > MAX_WITHDRAWALS){
            System.out.println("Lỗi - Bạn đã đạt giới hạn rút tiền tháng này");
            return;
        } 
        if(amount > 0 && amount <= balance){
            balance -= amount;
            withdrawalCount++;
            System.out.println("Đã rút " + amount + "VND");
            logTransaction("Withdrawal", amount);
        } else {
            if(amount < 0) System.out.println("Số tiền không hợp lệ");
            else System.out.println("Tài khoản không đủ số dư");
        }
    }

    public void applyMothlyInterest(){
        double interest = balance * (monthlyInterestRate / 100);
        balance += interest;
        logTransaction("Interest added", interest);
    }

    public void printTransactionHistory() {
        System.out.println("Lịch sử giao dịch:");
        for (int i = 0; i < transactionHistory.size(); i++) {
            System.out.println((i + 1) + ". " + transactionHistory.get(i));
        }
    }



    private void logTransaction(String type, double amount) {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        transactionHistory.add(type + ": " + amount + " VND " + "- " + date);
    }
}
