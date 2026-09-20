class BankAccount{
    private int balance;
    void setBalance(int balance){
        if(balance>=0){
            this.balance=balance;
        }else{
            System.out.println("Invalid balance");
        }
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int ammount){
        balance=balance+ammount;
    }
    public void withdraw(int ammount){
        if(ammount<=balance){
            balance=balance-ammount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}

public class ATM{
    public static void main(String []args){
        BankAccount acc=new BankAccount();

        acc.setBalance(1000);
        acc.deposit(5000);
        acc.withdraw(7000);

        System.out.println("Final Balance : "+acc.getBalance());

        acc.getBalance();
    }
}