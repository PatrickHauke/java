
package bubblesort_01;

public class bubbleSorting {

    public static void main(String[] args) {
        int numbers[] = {21, 13, 17, 5, 3};
        numInput(numbers);
        bubbleSort(numbers);
        printSort(numbers);
    }
    
    public static void numInput(int[] list){
        System.out.println("The following are a set of numbers out of order: ");
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+ " ");
        }
    }
    
    public static int[] bubbleSort(int[] list){ // this is the algorithm to perform the bubble sort. Numbers for L.7 inputs as list.
        int pass = 0;
        for(int i=0; i<list.length-1; i++){
            for(int j=0; j<list.length-1-i; j++){
                if(list[j] > list[j+1]){
                    int temp = list[j+1]; // temp is used to hold the value during the swap
                    list[j+1] = list[j];
                    list[j] = temp;
                    pass++;
                }
            }
        }
        System.out.printf("\n\nUsing a bubble sort algorithm, it took " + pass + " passes\nto sort the values the following:\n ");
        return list; // the now sorted list is sent back as the output of L.9
    }
    
    public static void printSort(int[] list){ // same as bubbleSort() where numbers is passed\
        
        
        for(int i=0; i<list.length; i++){     // into list, computed, and is output to printSort()
            System.out.print(list[i] + " ");
        }
    }
}
