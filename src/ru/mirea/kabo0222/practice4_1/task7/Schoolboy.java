package ru.mirea.kabo0222.practice4_1.task7;
import ru.mirea.kabo0222.practice4_1.task7.Learner;

public class Schoolboy extends Learner {
    private final int grade;
    private final String school_name;

    public Schoolboy(int age, String fullname, char gender, int grade, String school_name) {
        super(age, fullname, gender);
        this.grade = grade;
        this.school_name = school_name;
    }

    @Override
    public String toString() {
        return "Schoolboy{" +
                "grade=" + grade +
                ", school_name='" + school_name + '\'' +
                ", age=" + age +
                ", fullname=" + fullname +
                ", gender=" + gender +
                '}';
    }
}
