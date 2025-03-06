package kr.ac.hansung.cse.animals;

import lombok.Setter;

import java.io.Serial;

public class Dog implements AnimalType {

    @Setter
    String myName;

/*    public void setMyName(String myName) {
        this.myName = myName;
    }*/

    public void sound() {
        System.out.println("Dog name= " + myName + ": " + "Bow Wow");
    }
}
