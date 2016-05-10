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
public abstract class Account {
    int accNum;
    double accBal;
    
    public Account(int accNum){
        this.accNum = accNum;
        accBal = 0;
    }
    public void setAccBal(double accBal){
        this.accBal = accBal;
    }
   
    // values are being set within the classes Checking and Savings 
    public abstract double getAccBal(); 
    public abstract int getAccNum();
    public abstract void printInfo();
}
