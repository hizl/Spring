package runner;

import People.Human;
import Pet.Animal;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("myApplicationContext.xml");

        Human bean = context.getBean("people", Human.class);

        Animal bean2 = context.getBean("idAnimal", Animal.class);

        bean.say();
        bean2.say();
        context.close();

    }
}
