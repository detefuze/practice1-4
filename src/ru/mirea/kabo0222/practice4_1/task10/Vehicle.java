package ru.mirea.kabo0222.practice4_1.task10;
import java.util.*;
/*
10. Создать абстрактный класс, описывающий Транспортное средство и
подклассы Автомобиль, Самолет, Поезд, Корабль. Подсчитать время и
стоимость перевозки пассажиров и грузов каждым транспортным средством
 */
public abstract class Vehicle {
    protected int speed;
    protected double price;

    protected abstract void move(int distance);

    public static void main(String[] args) {
        Train train = new Train(220, 50);
        Car car = new Car(100, 65);
        Ship ship = new Ship(70, 80);
        Airplane airplane = new Airplane(300, 100);

        train.move(1000);
        car.move(100);
        ship.move(500);
        airplane.move(2400);
    }
}
