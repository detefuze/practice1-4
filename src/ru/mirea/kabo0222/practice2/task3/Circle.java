package ru.mirea.kabo0222.practice2.task3;
import java.util.*;
public class Circle
{
    private final Point center;
    private double radius;
    public Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Point { center="+center+", radius="+radius+" }";
    }

}
