
package bankaccount;
//import java.util.Scanner;
public class BankAccount {
    private int accNum;
    private String accName;
    private double accBalance;
    BankAccount(){
        accNum = 66666;
        accName = "Bill";
        accBalance = 4000.00;
    }
    
    public int getAccountNum(){
        return accNum;
    }
    public void setAccountNum(int num){
        accNum = num;
        //return BankAccount.accountNum;
    }
    public String getName(){
        return accName;
    }
    public void setName(String name){
        accName = name;
    }
    public double getBalance(){
        return accBalance;
    }
    public void setBalance(double balance){
        accBalance = balance;
        
    }
    public double deductMonthlyFee(){
       double postFee;
       postFee = getBalance() -4.00;
       return postFee;
    }
//    public static BankAccount getData(BankAccount acct){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Account number >> ");
//        acct.setAccountNum(input.nextInt());
//        
//        System.out.println("Account name >> ");
//        acct.setName(input.next());
//        
//        System.out.println("Account balance >> ");
//        acct.setBalance(input.nextDouble());
//        
//        System.out.println();
//        return acct;
//    }
//    public static BankAccount showValues(BankAccount acctRet){
//        System.out.println("Account number >> ");
//        acctRet.getAccountNum();
//        
//        System.out.println("Account name >> ");
//        acctRet.getName();
//        
//        System.out.println("Account balance >> ");
//        acctRet.getBalance();
//        
//        
//        return acctRet;
//    }
        
}

    
//    public String explainAccountPolicy(){
//        return(System.out.println("Here is a banking fee!"));
//    }
