package kr.ac.hansung.cse.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class CatTest {

    @Test
    void sound_outputsCorrectMessage() {
        Cat cat = new Cat();
        cat.setMyName("bella");

        assertDoesNotThrow(() -> cat.sound());
    }

    @Test
    void sound_withDifferentName_outputsCorrectMessage() {
        Cat cat = new Cat();
        cat.setMyName("kitty");

        assertDoesNotThrow(() -> cat.sound());
    }
}
