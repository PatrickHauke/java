
package day;

public class Day {
    private static final int MON = 0; 
// These numbers will pass on to the array to allow for the String to be passed back up
    private static final int TUE = 1; 
// Line 17 && 18, then used within the method checkInput()
    private static final int WED = 2;
    private static final int THU = 3;
    private static final int FRI = 4;
    private static final int SAT = 5;
    private static final int SUN = 6;
    private int day;
    
    private static String [][] acceptedStrings = {
    {"Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday"}, 
    {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}

};
    public static int checkInput (String input){
        int day = 0;
        
        for (int i =-0; i<2; i++){ // two dimensional arrays which does a check for each value
            for (int j =0;j<7;j++){
                //System.out.println(acceptedStrings[i][j]);
                // The above is used for debuging purpose to find out where a program will break in a loop
                if(acceptedStrings[i][j].equalsIgnoreCase(input)) {
                    day = j;
                    break;
                }
            }
        }
        
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public void print(){
        System.out.println(this.toString());
    }
    
    public int getDay(){
        return day;
    }
    
    public int nextDay(){
        return (day + 1) % 7;
    }
    public int lastDay(){
        return (day - 2) % 7;
    }
    
    public int calcDate(int newDay){
        return ((day + newDay) % 7) + 1;
    }
    
    public Day(){ // constructor
        this.day = MON;
    }
    
    public Day(int day){ // constructor
        this.day = day;
    }
    
    @Override
    public String toString(){
        switch(this.day){
            case MON:
                return "Monday\n";
            case TUE:
                return "Tuesday\n";
            case WED:
                return "Wednesday\n";
            case THU:
                return "Thursday\n";
            case FRI:
                return "Friday\n";
            case SAT:
                return "Saturday\n";
            case SUN:
                return "Sunday\n";
        }
        return "";
    }
}
