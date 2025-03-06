package kr.ac.hansung.cse.animals;

import lombok.Setter;

public class Cat implements AnimalType {

    @Setter
    String myName;

/*    public void setMyName(String myName) {
        this.myName = myName;
    }*/

    public void sound() {
        System.out.println("Cat name =" + myName + ": " + "Meow!");
    }
}
