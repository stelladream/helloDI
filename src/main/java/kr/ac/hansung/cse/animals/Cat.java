package kr.ac.hansung.cse.animals;

import lombok.Setter;

public class Cat implements AnimalType {

    @Setter
    String myName;

    public void sound() {
        System.out.println("Cat name =" + myName + ": " + "Meow!");
    }
}
