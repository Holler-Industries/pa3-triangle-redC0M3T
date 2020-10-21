package com.example.project;

public class TrianglePlayground {

    public static void main(String[] args){

     // main code
     Triangle myTriangle = new Triangle(1,2,3,1,5,3);

     System.out.println(myTriangle.perimeter());
     System.out.println("Expected perimeter: 9.19");

     System.out.println(myTriangle.area());
     System.out.println("Expected area: 3.00");

     myTriangle.translateX(1.5);
     double x0 = myTriangle.getx0();
     double y0 = myTriangle.gety0();
     double x1 = myTriangle.getx1();
     double y1 = myTriangle.gety1();
     double x2 = myTriangle.getx2();
     double y2 = myTriangle.gety2();
     System.out.println("The new triangle is:" + "(" + x0 +" , " + y0 + ")" + " , " + "(" + x1 + " , " + y1 + ")" + " , " + "(" + x2 + " , " + y2 + ")");

     myTriangle.translateY(2.25);
     double nx0 = myTriangle.getx0();
     double ny0 = myTriangle.gety0();
     double nx1 = myTriangle.getx1();
     double ny1 = myTriangle.gety1();
     double nx2 = myTriangle.getx2();
     double ny2 = myTriangle.gety2();
     System.out.println("The new triangle is:" + "(" + nx0 +" , " + ny0 + ")" + " , " + "(" + nx1 + " , " + ny1 + ")" + " , " + "(" + nx2 + " , " + ny2 + ")");

     //addons
     System.out.println(myTriangle.length(0,0));
     System.out.println(myTriangle.length(1,2));
     System.out.println(myTriangle.length(2,0));

    }
}
