package com.coding.util;

import com.coding.geomatry.Circle;
import com.coding.geomatry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double circleArea = Math.PI * Math.pow(cir.radius,2);
        double rectangleArea = rect.breadth * rect.length;

        System.out.printf("Area of the circle is: %f, Area of the rectangle is: %f",circleArea,rectangleArea);
    }
}
