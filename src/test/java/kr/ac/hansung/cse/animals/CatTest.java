package kr.ac.hansung.cse.animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

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
        Cat cat = new Cat();
        cat.setMyName("bella");

        cat.sound();

        assertEquals("Cat name =bella: Meow!", outContent.toString().trim());
    }

    @Test
    void sound_withDifferentName_outputsCorrectMessage() {
        Cat cat = new Cat();
        cat.setMyName("kitty");

        cat.sound();

        assertEquals("Cat name =kitty: Meow!", outContent.toString().trim());
    }
}
