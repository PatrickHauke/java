/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemoaccounts;

import java.util.Scanner;

/**
 *
 * @author patrick
 */
public class AccountArray extends DemoAccounts {
    
    public void AccountArray(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter in the amount of clients to bring in: ");
        int TEST = sc.nextInt(),i = 0;
        
        //Class work asks for 10 mixed accounts in total. For testing purposes, the array is set to a value determined by the user
        Account[] client = new Account[TEST]; 
        while(i<TEST){
            //The following displays an alternating assignment of values to each index within the array
            //Since 0 is considered even and is the first index in the array, we set method Checking() to be assigned to all even numbers
            if(i%2 == 0){
            System.out.println("Enter in clients Checking Account number");
            client[i] = new Checking(sc.nextInt());
            }
            //Since the if statment eliminated all integers with the remainder of 0 (even numbers where n%2 = 0),
            // all odd numbers will call the method Savings()
            else{
            System.out.println("Enter in clients Savings Account number followed by their interest rate");    
            client[i] = new Savings(sc.nextInt(),sc.nextDouble());
            }
            //increment after checking the index if it is either even or odd
            i++;
        }
        // Prints out all user input stored within the array from the method calls Checking() and Savings()
        // Integer j is used as a counter from 0 to n (where n is the user defined number of accoutns to input), it cycles through each index
        for(int j=0;j<TEST;j++){
            client[j].printInfo();
        }
    
    }
}
