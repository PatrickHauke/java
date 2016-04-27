
package bankaccount;
//import static bankaccount.BankAccount.getData;
//import static bankaccount.BankAccount.showValues;

import java.util.Scanner;

public class TestBankAccount {
    public static void main(String[] args) {  
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        BankAccount a3 = new BankAccount();
        BankAccount a4 = new BankAccount();
        
        getData(a1);
        getData(a2);
        getData(a3);
        
        showValues(a1);
        showValues(a2);
        showValues(a3);
        showValues(a4);
    }
    
    public static BankAccount getData(BankAccount acct){
        Scanner input = new Scanner(System.in);
        System.out.print("Input account number >> ");
        acct.setAccountNum(input.nextInt());
        
        System.out.print("Input account name >> ");
        acct.setName(input.next());
        
        System.out.print("Input account balance >> ");
        acct.setBalance(input.nextDouble());
        
        System.out.println();
        return acct;
    }
    public static BankAccount showValues(BankAccount acct){
        System.out.print("Account number >> ");
        System.out.println(acct.getAccountNum());
        
        System.out.print("Account name >> ");
        System.out.println(acct.getName());
        
        System.out.print("Account balance >> ");
        System.out.println(acct.getBalance());
        
        acct.setBalance(acct.deductMonthlyFee());
        System.out.println("New Account Balance Post Fee: " +acct.getBalance());
        
        System.out.println();
        
        return acct;
    }
    
//        
//        //Account 1
//        System.out.println(a1.getName());
//        System.out.println(a1.getAccountNum());
//        System.out.println(a1.getBalance());
//        System.out.println(a1.deductMonthlyFee());
//        
//        
//        //Account 2
//        System.out.print("Enter account number >> ");
//        a2.setAccountNum(input.nextInt());
//        input.nextLine();
//        System.out.print("Enter name >> ");
//        a2.setName(input.nextLine());
//        System.out.print("Enter balance >> ");
//        a2.setBalance(input.nextDouble());
//        System.out.println(a2.getName());
//        System.out.println(a2.getAccountNum());
//        System.out.println(a2.getBalance());
//        System.out.println(a2.deductMonthlyFee());
//        
//        
//        //Account 3
//        System.out.print("Enter account number >> ");
//        a3.setAccountNum(input.nextInt());
//        input.nextLine();
//        System.out.print("Enter name >> ");
//        a3.setName(input.nextLine());
//        System.out.print("Enter balance >> ");
//        a3.setBalance(input.nextDouble());
//        System.out.println(a3.getName());
//        System.out.println(a3.getAccountNum());
//        System.out.println(a3.getBalance());
//        System.out.println(a3.deductMonthlyFee());
//        
//        
//        //Account 4
//        System.out.print("Enter account number >> ");
//        a4.setAccountNum(input.nextInt());
//        input.nextLine();
//        System.out.print("Enter name >> ");
//        a4.setName(input.nextLine());
//        System.out.print("Enter balance >> ");
//        a4.setBalance(input.nextDouble());
//        System.out.println(a4.getName());
//        System.out.println(a4.getAccountNum());
//        System.out.println(a4.getBalance());
//        System.out.println(a4.deductMonthlyFee());
//    }
//    
    
    
    
}
