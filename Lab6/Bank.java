import java.util.*;

class Account{
    String Customer_name;
    int Accountno;
    int Account_balance ;

    Account(String cn, int accno, int balance){
        Customer_name = cn;
        Accountno = accno;
        Account_balance = balance;
    }

    void Deposit(int n){
        Account_balance = Account_balance + n;
        System.out.println(Account_balance);
    }

    void display(){
        System.out.println(Account_balance);
    }
    void Interest(){
        Account_balance = Account_balance*3/100+Account_balance;
        System.out.println(Account_balance);
    }
    void Withdraw(int n){
        Account_balance = Account_balance - n;
        System.out.println(Account_balance);
    }
    void Penalty(){
        if (Account_balance<250){
            System.out.println("Your bank balance is less than minimum balance penalty of amount 100 would be deducted from your account");
            
            Account_balance = Account_balance - 100;
            System.out.println(Account_balance);
        }
    }

}

class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter Customer name:");
        String cn = sc.nextLine();
        System.out.println("Enter account no:");
        int accno = sc.nextInt();
        System.out.println("Enter Balance:");
        int balance = sc.nextInt();
        Account acc1 = new Account(cn,accno,balance);
        System.out.println("enter chooice:\n1.deposit\n2.withdraw\n3.display balance\n");
        int ch = sc.nextInt();
        
            switch(ch){
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
        
    }
           
}
