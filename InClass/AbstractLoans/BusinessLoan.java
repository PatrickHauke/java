/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanswithabstractandinterface;

public class BusinessLoan extends Loan {
    BusinessLoan(String loanNum, String lName, double loanAmt, int term, double primeIntRate){
        super(loanNum, lName, loanAmt, term);
        super.intRate = 0.1/(primeIntRate/100);
    }
}
