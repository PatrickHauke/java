
package day;
import java.util.Scanner;
public class dayOutput {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        Day d = new Day();
        
        System.out.println("Here is the initial day: ");
        d.print();
        
        System.out.println("Enter in todays day in either triple char format (ie:TUE), or full name (ie:TUESDAY): \n");
        d.setDay(Day.checkInput(key.nextLine())); 
        
        System.out.println("\nNext Day: ");
        d.setDay(d.nextDay());
        d.print();
        
        System.out.println("\nPrevious Day: ");
        d.setDay(d.lastDay());
        d.print();
        
        System.out.println("Enter in the amount of days to skip: ");
        d.setDay(d.calcDate(key.nextInt()));
        System.out.println();
        d.print();
        
    }
}
