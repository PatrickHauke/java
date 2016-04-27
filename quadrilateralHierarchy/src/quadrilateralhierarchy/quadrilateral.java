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
public class quadrilateral {
    private points point1;
    private points point2;
    private points point3;
    private points point4;
    // coordinates from object coordinate are passed down to and set using constructor from points
    public quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        point1 = new points(x1,y1); // top left
        point2 = new points(x2,y2); // top right
        point3 = new points(x3,y3); // bottom right
        point4 = new points(x4,y4); // bottom left
    }
    public points getPoint1(){
        return point1;
    }
    public void setPoint1(double x1, double y1){
        point1.setX(x1);
        point1.setY(y1);
    }
    public points getPoint2(){
        return point2;
    }
    public void setPoint2(double x2, double y2){
        point2.setX(x2);
        point2.setY(y2);
    }
    public points getPoint3(){
        return point3;
    }
    public void setPoint3(double x3, double y3){
        point3.setX(x3);
        point3.setY(y3);
    }
    public points getPoint4(){
        return point4;
    }
    public void setPoint4(double x4, double y4){
        point4.setX(x4);
        point4.setY(x4);
    }
    @Override
    public String toString(){
        return ("\nCoordinate set for Quadrilateral is:\n"+
                getPoint1() + ", "+ getPoint2() + ", "+ getPoint3() + ", "+ getPoint4()+"\n");
        
        // toString() forces output as a string
        // if not given, the default will be a hashcode output @.....
   }
}
