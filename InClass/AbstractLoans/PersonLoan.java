
package loanswithabstractandinterface;

public class PersonLoan extends Loan {
    PersonLoan(String loanNum, String lName, double loanAmt, int term, double primeIntRate){
        super(loanNum, lName, loanAmt, term);
        super.intRate = 0.2/(primeIntRate/100);
    }
}
