package ru.mirea.kabo0222.practice4_1.task7;
import ru.mirea.kabo0222.practice4_1.task7.Learner;

public class Student extends Learner {
    private final int course;
    private final String university_name;

    public Student(int age, String fullname, char gender, int course, String university_name) {
        super(age, fullname, gender);
        this.course = course;
        this.university_name = university_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", university_name='" + university_name + '\'' +
                ", age=" + age +
                ", fullname=" + fullname +
                ", gender=" + gender +
                '}';
    }
}
