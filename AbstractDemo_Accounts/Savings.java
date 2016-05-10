/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemoaccounts;

/**
 *
 * @author patrick
 */
public class Savings extends Account { 
    double rate;
    
    public Savings(int accNum, double rate){
        super(accNum);
        this.rate = rate;
    }
    public void printInfo(){
        System.out.println("\nSavings Account Information\nAccount Number: " + getAccNum()
        + "\nAccount Ballance: "+ getAccBal()+"\nTheir interest rate is "+rate+"%");
    }
    public int getAccNum(){
        return accNum;
    }  
    public double getAccBal(){
        return accBal;
    } 
}
