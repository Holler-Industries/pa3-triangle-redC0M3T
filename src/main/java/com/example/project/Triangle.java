package com.example.project;
import java.lang.Math;

public class Triangle {

    // your code goes here: good luck =)
    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double l;

    public Triangle () {
        x0 = 0;
        y0 = 0;
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }

    public Triangle (double ix0, double iy0, double ix1, double iy1, double ix2, double iy2) {
        x0 = ix0;
        y0 = iy0;
        x1 = ix1;
        y1 = iy1;
        x2 = ix2;
        y2 = iy2;
    }

    public double perimeter () {
        double x3 = Math.pow(x1 - x0 , 2);
        double y3 = Math.pow(y1 - y0 , 2);
        double a = Math.sqrt(x3 + y3);

        double x4 = Math.pow(x2 - x1 , 2);
        double y4 = Math.pow(y2 - y1 , 2);
        double b = Math.sqrt(x4 + y4);

        double x5 = Math.pow(x0 - x2 , 2);
        double y5 = Math.pow(y0 - y2 , 2);
        double c = Math.sqrt(x5 + y5);

        return a + b + c;
    }

    public double area () {
        double x3 = Math.pow(x1 - x0 , 2);
        double y3 = Math.pow(y1 - y0 , 2);
        double a = Math.sqrt(x3 + y3);

        double x4 = Math.pow(x2 - x1 , 2);
        double y4 = Math.pow(y2 - y1 , 2);
        double b = Math.sqrt(x4 + y4);

        double x5 = Math.pow(x0 - x2 , 2);
        double y5 = Math.pow(y0 - y2 , 2);
        double c = Math.sqrt(x5 + y5);

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void translateX (double h) {
        x0 = x0 + h;
        x1 = x1 + h;
        x2 = x2 + h;
    }

    public void translateY (double v) {
        y0 = y0 + v;
        y1 = y1 + v;
        y2 = y2 + v;
    }

    // addons
    public double length (int a, int b) {
        if (a == 0) {
            if (b == 1) {
                double x6 = Math.pow(x0 - x1, 2);
                double y6 = Math.pow(y0 - y1, 2);
                l = Math.sqrt(x6 + y6);
            }
            else if (b == 2) {
                double x7 = Math.pow(x0 - x2, 2);
                double y7 = Math.pow(y0 - y2, 2);
                l = Math.sqrt(x7 + y7);
            }
            else {
                System.out.println("There is no length between two same points.");
            }
        }
        else if (a == 1) {
            if (b == 0) {
                double x8 = Math.pow(x1 - x0, 2);
                double y8 = Math.pow(y1 - y0, 2);
                l = Math.sqrt(x8 + y8);
            }
            else if (b == 2) {
                double x9 = Math.pow(x1 - x2, 2);
                double y9 = Math.pow(y1 - y2, 2);
                l = Math.sqrt(x9 + y9);
            }
            else {
                System.out.println("There is no length between two same points.");
            }
        }
        else if (a == 2) {
            if (b == 0) {
                double x10 = Math.pow(x2 - x0, 2);
                double y10 = Math.pow(y2 - y0, 2);
                l = Math.sqrt(x10 + y10);
            }
            else if (b == 1) {
                double x11 = Math.pow(x2 - x1, 2);
                double y11 = Math.pow(y2 - y1, 2);
                l = Math.sqrt(x11 + y11);
            }
            else {
                System.out.println("There is no length between two same points.");
            }
        }
        return l;
    }


    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }
}
