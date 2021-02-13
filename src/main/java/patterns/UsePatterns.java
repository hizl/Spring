package patterns;

import Pet.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsePatterns {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("secondContext.xml");
        Dog firstDog = context.getBean("pet", Dog.class);
        firstDog.setName("Nikki");

        Dog secondDog = context.getBean("pet", Dog.class);
        secondDog.setName("Nessy");

        System.out.println(secondDog.getName());
        System.out.println(firstDog.getName());

        System.out.println(firstDog == secondDog);
        System.out.println(firstDog.equals(secondDog));
    }


}
