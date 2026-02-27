package kr.ac.hansung.cse.animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(locations = "classpath:conf/animal.xml")
class PetOwnerTest {

    @Autowired
    private PetOwner petOwner;

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
    void petOwner_isInjectedBySpring() {
        assertNotNull(petOwner);
    }

    @Test
    void animal_isInjectedBySpring() {
        assertNotNull(petOwner.animal);
    }

    @Test
    void play_withQualifierDog_outputsDogSound() {
        petOwner.play();

        assertEquals("Dog name= poodle: Bow Wow", outContent.toString().trim());
    }
}
