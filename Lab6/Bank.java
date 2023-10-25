import java.util.*;

class Account {
    String Customer_name;
    int Accountno;
    int Account_balance;
    int rate;
    
    void Deposit(int n) {
        Account_balance = Account_balance + n;
        System.out.println(Account_balance);
    }

    void display() {
        System.out.println(Account_balance);
    }

    void Withdraw(int n) {
        Account_balance = Account_balance - n;
        System.out.println(Account_balance);
    }
}

class SavingAccount extends Account {
    SavingAccount() {
        rate = 3;
    }

    void Interest() {
        Account_balance = Account_balance * rate / 100 + Account_balance;
        System.out.println(Account_balance);
    }
}

class CurrentAccount extends Account {
    CurrentAccount() {
        rate = 0;
    }

    void Interest() {
        Account_balance = Account_balance * rate / 100 + Account_balance;
        System.out.println(Account_balance);
    }

    void Penalty() {
        if (Account_balance < 250) {
            System.out.println(
                    "Your bank balance is less than minimum balance penalty of amount 100 would be deducted from your account");

            Account_balance = Account_balance - 100;
            System.out.println(Account_balance);
        }
    }
}

class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        System.out.println("enter Customer name:");
        String cn = sc.nextLine();
        System.out.println("Enter the type of account:\n");
        System.out.println("1.Savings Account\n2.Current Account");
        int acct = sc.nextInt();
        switch (acct) {
            case 1:
                SavingAccount acc = new SavingAccount();
                System.out.println("Enter account no:");
                int accno = sc.nextInt();
                System.out.println("Enter Balance:");
                int balance = sc.nextInt();
                acc.Deposit(balance);
                while (flag == 1) {
                    System.out.println("enter chooice:\n1.deposit\n2.withdraw\n3.display balance\n");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("Enter the amount to deposit:");
                            int d = sc.nextInt();
                            acc.Deposit(d);
                            break;
                        case 2:
                            System.out.println("Enter the amount to withdraw:");
                            int w = sc.nextInt();
                            acc.Withdraw(w);
                            break;
                        case 3:
                            System.out.println("Account balance:");
                            acc.Interest();
                            break;
                    }
                    System.out.println("Repeat the same(Y/N)? ");
                    char c = sc.next().charAt(0);
                    if (c == 'N' || c == 'n')
                        flag = 0;
                }
                break;

            case 2:
                CurrentAccount acc1 = new CurrentAccount();
                System.out.println("Enter account no:");
                int accno1 = sc.nextInt();
                System.out.println("Enter Balance:");
                int balance1 = sc.nextInt();
                acc1.Deposit(balance1);
                System.out.println("enter chooice:\n1.deposit\n2.withdraw\n3.display balance\n");
                int ch1 = sc.nextInt();
                while (flag == 1) {
                    switch (ch1) {
                        case 1:
                            System.out.println("Enter the amount to deposit:");
                            int d = sc.nextInt();
                            acc1.Deposit(d);
                            break;
                        case 2:
                            System.out.println("Enter the amount to withdraw:");
                            int w = sc.nextInt();
                            acc1.Withdraw(w);
                            break;
                        case 3:
                            System.out.println("Account balance:");
                            acc1.Interest();
                            break;
                        default:
                            System.out.println("Wrong choice");
                    }
                    acc1.Penalty();
                    System.out.println("Repeat the same(Y/N)? ");
                    char c = sc.next().charAt(0);
                    if (c == 'N' || c == 'n')
                        flag = 0;
                }
                break;
        }
    }
}
