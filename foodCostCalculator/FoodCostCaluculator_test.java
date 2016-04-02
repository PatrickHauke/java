
package foodcostcaluculator_test;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author patrick
 */
public class FoodCostCaluculator_test {

    public static void main(String[] args) {
        valueInputs guest = new valueInputs();
        setData(guest);
        showData(guest);
    }
    
    public static valueInputs setData(valueInputs guest){
        Scanner input=new Scanner(System.in);
        byte i=1;
        System.out.println("Enter in the items belonging to you: ");
        guest.setItemCount(input.nextInt());
        
        System.out.println("Enter in the cost of each item.");
        int count = guest.getItemCount();
            while(i<=count){
                System.out.println("\nItem #"+i);
                System.out.print("Cost: ");
                guest.setItemCost(input.nextDouble()); 
                guest.holdPreTaxMeal();
                i++;
            }
        
        
        System.out.println("\nWhat is your local tax rate? ");
        guest.setTaxRate(input.nextDouble());
        
        System.out.println("\nWhat tip percent would you like to give?");
        guest.setTipRate(input.nextDouble());
        
        return guest;
    }
    
    public static valueInputs showData(valueInputs guest){
        DecimalFormat df = new DecimalFormat("$0.00");
       
        System.out.println("\nThe bill after tax is "+ df.format(guest.getFinalTax())+".\n");
        System.out.println("The tip to provide is "+ df.format(guest.getFinalTip())+".\n");
        System.out.println("The total bill with tip is "+ df.format(guest.getFinalBill())+".");
        
        return guest;
    }
}
