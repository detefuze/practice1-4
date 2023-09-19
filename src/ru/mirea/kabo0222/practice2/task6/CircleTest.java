package ru.mirea.kabo0222.practice2.task6;
import java.util.*;
import java.lang.*;
public class CircleTest {
    public static void main(String[] args) {
        Circle circ1 = new Circle(3,1,0);
        Circle circ2 = new Circle(4,2,1);
        System.out.println("Радиус circ1: "+circ1.getRadius());
        circ2.setRadius(8);
        circ1.difference(circ1, circ2);
    }
}
