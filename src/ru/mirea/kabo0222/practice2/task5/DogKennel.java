package ru.mirea.kabo0222.practice2.task5;
import java.util.*;
import java.lang.*;
public class DogKennel
{
    private int dogs;
    private Dog[] pack;

    public DogKennel(Dog[] kennel) {
        this.dogs = kennel.length;
        this.pack = kennel;
    }

    public void addDog(Dog dog){
        Dog[] new_pack = new Dog[this.dogs+1];
        System.arraycopy(this.pack,0,new_pack,0,this.dogs);
        new_pack[new_pack.length-1] = dog;
        this.pack = new_pack;
        this.dogs++;
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "kennel=" + Arrays.toString(pack) +
                '}';
    }

    public static void main(String[] args)
    {
        Dog Alt = new Dog("Alt", 3);
        Dog Bro = new Dog("Bro", 5);
        Dog Bim = new Dog("Bim", 1);
        Dog Lark = new Dog("Lark", 7);
        Dog[] dogs = {Alt, Bro, Bim};
        DogKennel kennel = new DogKennel(dogs);
        System.out.println(kennel.toString());
        kennel.addDog(Lark);
        System.out.println(kennel.toString());
    }
}
