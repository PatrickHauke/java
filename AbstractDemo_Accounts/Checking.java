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
public class Checking extends Account {
    
    public Checking(int accNum){
        super(accNum);
    }
    public void printInfo(){
        System.out.println("\nChecking Account Information\nAccount Number: " + getAccNum()
        + "\nAccount Ballance: "+ getAccBal());     
    }    
    public int getAccNum(){
        return accNum;
    }
    public double getAccBal(){
        return accBal;
    }
}
