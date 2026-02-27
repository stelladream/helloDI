package kr.ac.hansung.cse;

import kr.ac.hansung.cse.animals.Dog;
import kr.ac.hansung.cse.animals.PetOwner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Dog dogId() {
        Dog dog = new Dog();
        dog.setMyName("poodle");
        return dog;
    }

    @Bean
    public PetOwner petOwnerId() {
        return new PetOwner(dogId());
    }
}
