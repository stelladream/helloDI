package kr.ac.hansung.cse.animals;

public class PetOwner {

    public AnimalType animal;

    public PetOwner(AnimalType animal) {
        this.animal = animal;
    }

    public void play() {
        animal.sound();
    }
}