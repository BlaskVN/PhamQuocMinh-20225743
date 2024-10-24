import java.util.Scanner;

public class AccountManagement {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Tạo tài khoản mới");
        String strName = keyboard.nextLine();
        BankAccount account = new BankAccount(strName, 5000000, 1.0);

        while (true) {
            System.out.println("--------------------");
            System.out.println("\t\tBANK");
            System.out.println("--------------------");
            System.out.println("1. Gửi tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Xem số dư");
            System.out.println("4. Thêm lãi hàng tháng");
            System.out.println("5. Xem lịch sử giao dịch");
            System.out.println("0. Thoát");
            System.out.println("--------------------");
            System.out.print("Chọn chức năng: ");
            int choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số tiền cần gửi: ");
                    double depositAmount = keyboard.nextDouble();
                    account.deposit(depositAmount);
                    continue;
                case 2:
                    System.out.println("Nhập số tiền cần rút: ");
                    double withdrawAmount = keyboard.nextDouble();
                    account.withdraw(withdrawAmount);
                    continue;
                case 3:
                    System.out.println("Số dư hiện tại: " + account.getBalance());
                    continue;
                case 4:
                    account.applyMothlyInterest();
                    continue;
                case 5:
                    account.printTransactionHistory();
                    continue;
                case 0:
                    keyboard.close();
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ");
                    continue;
            }
        }
    }
}
