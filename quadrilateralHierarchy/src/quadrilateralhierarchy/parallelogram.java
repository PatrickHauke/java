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
public class parallelogram extends trapezoid { 
    public parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    public double getWidth(){
        return getSideA_Len();
    }
    @Override
    public double getArea(){
        return(getWidth()*getHeight()); //inherited from trapezoid
    }
    @Override
    public String toString(){
        return ("\nCoordinate set for a Parallelogram is:\n"+
                getPoint1() + ", "+ getPoint2() + ", "+ getPoint3() + ", "+ getPoint4()+
                "\nWidth is: "+ getWidth() +"\nHeight is: "+ getHeight() + " || " + "Area is: "+ getArea()+"\n");
    }
}
