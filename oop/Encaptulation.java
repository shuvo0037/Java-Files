package oop;

public class Encaptulation {
   public static void main(String[] args) {
        BankAccount ba=new BankAccount();

        ba.Deposite(5000);
        ba.withdraw(100);
        ba.ShowBalance();
    }
}

class BankAccount{
    private double balance;

    void Deposite(int ammount){
        balance+=ammount;
    }

    void withdraw(int ammount){
        if(ammount>balance)
            System.out.println("Insufficient Balance");
        else
            balance-=ammount;
    }

    void ShowBalance(){
        System.out.println("Your Balance is :" +balance);
    }
}
