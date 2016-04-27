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

// All data is a trickle down effect. Points gives data to quadrilateral, then trapezoid, parallelogram, rectangle, and finally square cutting 
// away what is no longer needed in the code without having to do rewrites.
public class trapezoid extends quadrilateral {
    private double sideA_Len;
    private double sideB_Len;
    private double height;
    
    public trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        super(x1,y1,x2,y2,x3,y3,x4,y4);
    }
    public double getHeight(){
        return (Math.abs(getPoint1().getY() - getPoint4().getY()));
    }
    public double getSideA_Len(){
        return (Math.abs(getPoint1().getX() - getPoint2().getX()));
    }
    public double getSideB_Len(){
        return (Math.abs(getPoint3().getX() - getPoint4().getX()));
    }
    public double getArea(){
        sideA_Len = getSideA_Len();
        sideB_Len = getSideB_Len();
        height = getHeight();
        return (.5 * height * (sideA_Len+sideB_Len)/2); // formula for A of trapezoid
    }
    @Override
    public String toString(){
        return ("\nCoordinate set for a Trapezoid is:\n"+
                getPoint1() + ", "+ getPoint2() + ", "+ getPoint3() + ", "+ getPoint4()+
                "\nHeight is: "+ getHeight() + " || " + "Area is: "+ getArea()+"\n");
    }
}