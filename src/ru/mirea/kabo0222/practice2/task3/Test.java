package ru.mirea.kabo0222.practice2.task3;
import java.util.*;
public class Test {
    private int size;
    private Circle[] circles = new Circle[size];

    public Test(int size, Circle[] circles)
    {
        this.size = size;
        this.circles = circles;
    }

    @Override
    public String toString() {
        return "Test{" +
                "size=" + size +
                ", circles=" + Arrays.toString(circles) +
                '}';
    }

    public static void main(String[] args)
    {
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,0);
        Point p3 = new Point(2,0);
        Circle c1 = new Circle(p1, 2);
        Circle c2 = new Circle(p2, 4);
        Circle c3 = new Circle(p3, 6);
        Circle[] circles = {c1,c2,c3};
        Test test = new Test(3, circles);
        System.out.println(test.toString());
    }

}
