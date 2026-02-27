package kr.ac.hansung.cse.animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void sound_outputsCorrectMessage() {
        Dog dog = new Dog();
        dog.setMyName("poodle");

        dog.sound();

        assertEquals("Dog name= poodle: Bow Wow", outContent.toString().trim());
    }

    @Test
    void sound_withDifferentName_outputsCorrectMessage() {
        Dog dog = new Dog();
        dog.setMyName("bulldog");

        dog.sound();

        assertEquals("Dog name= bulldog: Bow Wow", outContent.toString().trim());
    }
}
