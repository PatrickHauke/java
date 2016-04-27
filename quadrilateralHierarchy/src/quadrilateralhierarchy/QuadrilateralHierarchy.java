/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrilateralhierarchy;

/**
 *
 * @author patrick
 */
public class QuadrilateralHierarchy {
    public static void main(String[] args) {
        
       quadrilateral quadrilateral = new quadrilateral(1.1,1.2,6.6,2.8,6.2,9.9,2.2,7.4);
       trapezoid trapezoid = new trapezoid(0.0,0.0,10.0,0.0,8.0,5.0,3.3,5.0);
       parallelogram parallelogram = new parallelogram(5.0,5.0,11.0,5.0,12.0,20.0,6.0,20.0);
       rectangle rectangle = new rectangle(17.0,14.0,30.0,14.0,30.0,28.0,17.0,28.0);
       square square = new square(4.0,0.0,8.0,0.0,8.0,4.0,4.0,4.0);
       
       System.out.printf("%s %s %s %s %s\n", quadrilateral, trapezoid, parallelogram, rectangle, square);
    
    }
}
