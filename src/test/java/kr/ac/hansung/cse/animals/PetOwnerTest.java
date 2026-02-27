package kr.ac.hansung.cse.animals;

import kr.ac.hansung.cse.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(AppConfig.class)
class PetOwnerTest {

    @Autowired
    private PetOwner petOwner;

    @Test
    void petOwner_isInjectedBySpring() {
        assertNotNull(petOwner);
    }

    @Test
    void animal_isInjectedBySpring() {
        assertNotNull(petOwner.animal);
    }

    @Test
    void play_withDog_doesNotThrow() {
        assertDoesNotThrow(() -> petOwner.play());
    }
}
