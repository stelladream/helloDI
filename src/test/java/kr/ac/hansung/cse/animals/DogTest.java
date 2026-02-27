package kr.ac.hansung.cse.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DogTest {

    @Test
    void sound_outputsCorrectMessage() {
        Dog dog = new Dog();
        dog.setMyName("poodle");

        assertDoesNotThrow(() -> dog.sound());
    }

    @Test
    void sound_withDifferentName_outputsCorrectMessage() {
        Dog dog = new Dog();
        dog.setMyName("bulldog");

        assertDoesNotThrow(() -> dog.sound());
    }
}
