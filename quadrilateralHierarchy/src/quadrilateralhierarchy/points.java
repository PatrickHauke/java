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

// coordinates are passed from quadrilateral to class points. 
// at this part, all get/set methods are put in to place along with the primary print format for the coordinates        

public class points {
    private double x;
    private double y;

    public points(){ 
        x=0.0;
        y=0.0;
    }
    public points(double x, double y){ 
        this.y = y;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return y;
    }
    @Override
    public String toString(){
        return ("(" + x + ", " + y + ")");
    }

//    int getY() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}