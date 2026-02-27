package kr.ac.hansung.cse;

import kr.ac.hansung.cse.animals.PetOwner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PetOwner person = (PetOwner) context.getBean("petOwnerId");
        person.play();

        context.close();
    }
}