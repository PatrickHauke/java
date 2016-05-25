
package loanswithabstractandinterface;
import java.util.Scanner;

/**
 *
 * @author patrick
 */
class CreateLoans {
    
    //Set the array for the loan to be 1. Makes testing output format faster.
    // It is understood that it should be 5
    private Loan[] loanDetails = new Loan[1];
    public static void main(String[] args) {
        CreateLoans loan = new CreateLoans();
        
        loan.getLoanDetails();
        loan.showDetails();
    }

    public void showDetails() {
        System.out.println("Loan Number \tLast Name\tLoan Amount\t" +
                           "Interest Rate\tLoan Term\tTotal Amount Owned");
    
        for(int x= 0; x<loanDetails.length;x++){
            System.out.println(loanDetails[x].toString());
        }
    }
    public static Character getLoanType() {   
        Scanner sc = new Scanner(System.in);
        Character loanType;  
        
        
        do {
            System.out.print("Is the loan for personal or business purposes? (P/B): ");
            loanType = sc.next().toLowerCase().charAt(0);
            
            if (!((loanType.equals('p')) || (loanType.equals('b'))))
                System.out.println("Invalid input!");
        } while (!((loanType.equals('p')) || (loanType.equals('b'))));

        return loanType;
    }
    
    public static String getLoanNum(){
        System.out.println("Loan Number: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static String getLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Customer last name: ");
        String lName = sc.next();
        return lName;
    }
    
    public static double getLoanAmt(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Loan amount: ");
        double loanAmt = sc.nextDouble();

            if (loanAmt <= 0) {
                System.out.println("Loan amount must not be zero or lesser.");
            } else if (loanAmt > 100000) {
                System.out.println("Loan amount must not be over $100,000.00");
            }

            return loanAmt;
    }
    public static double getPrimeIntRate() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Prime interest rate (%): ");
        double primeIntRate = sc.nextDouble();
                       
            if (primeIntRate <= 0) {
                System.out.println("Interest rate must not be zero or lesser.");
            }
            
            return primeIntRate;
        } 
    
    
    public static int getTerm() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Loan term (1, 3, or 5): ");
        return sc.nextInt();
        }
    
    public void getLoanDetails() {
       
        for (int x = 0; x < loanDetails.length; x++) {
            System.out.println("Enter loan details for customer " + (x + 1) + "#");

            Character loanType = getLoanType();
            String loanNum = getLoanNum();
            String lastName = getLastName();
            double loanAmount = getLoanAmt();
            double primeIntRate = getPrimeIntRate();
            int term = getTerm();
            
            System.out.println();

            if (loanType.equals('p')) {
                loanDetails[x] = new PersonLoan(loanNum, lastName,
                        loanAmount, term, primeIntRate);
            } else if (loanType.equals('b')) {
                loanDetails[x] = new BusinessLoan(loanNum, lastName,
                        loanAmount, term, primeIntRate);
            }
        }
    }
}

