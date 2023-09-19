package ru.mirea.kabo0222.practice4_1.task7;

import java.util.*;
public class Learner {
    protected int age;
    protected String fullname;
    protected char gender;

    public Learner(int age, String fullname, char gender) {
        this.age = age;
        this.fullname = fullname;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Learner{" +
                "age=" + age +
                ", fullname=" + fullname +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {
        Schoolboy Mark = new Schoolboy(14, "Markus", 'm', 8, "Brandon's School");
        Schoolboy Ted = new Schoolboy(16, "Ted", 'm', 10, "Record's High School");
        Student Lisa = new Student(20, "Elizabeth", 'f', 3, "MIREA");
        Student Peter = new Student(18, "Peter", 'm', 1, "Cambridge University");
        Learner[] learners = {Mark, Lisa, Ted, Peter};
        ArrayList<Student> students = new ArrayList<Student>(1);
        ArrayList<Schoolboy> schoolboys = new ArrayList<Schoolboy>(1);
        for (Learner learner : learners) {
            if (learner instanceof Student)
                students.add((Student) learner);
            else if (learner instanceof Schoolboy)
                schoolboys.add((Schoolboy) learner);
        }
        for (Student student : students) {
            System.out.println("Студент: " + student.toString());
        }
        for (Schoolboy schoolboy : schoolboys) {
            System.out.println("Школьник: " + schoolboy.toString());
        }
    }
}
