package ru.mirea.kabo0222.practice2.task6;
import java.util.*;
import java.lang.*;
public class Circle
{
    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y) {
        if (radius > 0)
            this.radius = radius;
        else
            this.radius = 0;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            System.out.println("Радиус должен быть > 0");
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double circleSquare(double r)
    {
        return 3.14*r*r;
    }

    public double circleLength(double r)
    {
        return 2*3.14*r;
    }

    public void difference(Circle c1, Circle c2)
    {
        System.out.println("Разность радиусов окружностей: "+(Math.abs(c1.radius-c2.radius)));
        System.out.println("Разность площадей окружностей: "+(Math.round(Math.abs(c1.circleSquare(c1.radius)-c2.circleSquare(c2.radius)))));
        System.out.println("Разность длин окружностей: "+(Math.round(Math.abs(c1.circleLength(c1.radius)-c2.circleLength(c2.radius)))));
    }
}
