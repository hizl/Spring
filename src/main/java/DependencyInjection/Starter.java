package DependencyInjection;

import Pet.Animal;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    //the main thread
    //without using spring-framework
    public static void main(String[] args) {

        /*
        Animal dog = new Dog(); //Cat
        Employee bob = new Employee(dog);
        bob.couldYourPet();
        */


        //this use spring-config.xml file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myApplicationContext.xml");
        Employee bean = context.getBean("empl", Employee.class);

        bean.couldYourPet();

        context.close();
    }
}
