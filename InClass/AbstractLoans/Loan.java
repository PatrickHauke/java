
package loanswithabstractandinterface;

public abstract class Loan implements LoanConstants {
    private String loanNum;
    private String lName;
    private double loanAmt;
    protected double intRate;
    private int term;
    
    Loan(String loanNum, String lName, double loanAmt, int term){
        this.loanNum = loanNum;
        this.lName = lName.toUpperCase();
        this.loanAmt = loanAmt;
    
    
    switch (term) {
        case Mid_Term:
        case Long_Term:
            this.term = term;
            break;
        case Short_Term:
        default:
            this.term = 1;
            break;
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s\t\t%s\t\t$%,.2f\t\t%.2f%%\t\t%d\t\t$%,.2f",
               this.loanNum, this.lName, loanAmt, intRate * 100,
               this.term, loanAmt + (loanAmt * intRate));
    }
}
