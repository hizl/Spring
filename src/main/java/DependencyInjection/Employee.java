package DependencyInjection;

import Pet.Animal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
    private Animal pet;


    public Employee(Animal pet) {
        this.pet = pet;
    }


    public void couldYourPet() {
        System.out.println("Call a pet ");
        pet.say();
    }

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
        Animal bean = context.getBean("idAnimal", Animal.class);

        Employee employee = new Employee(bean);

        employee.couldYourPet();

        context.close();
    }
}
