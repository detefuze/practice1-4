package ru.mirea.kabo0222.practice2.task3;
import java.util.*;
public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point { x="+x+", y="+y+" }";
    }
}
