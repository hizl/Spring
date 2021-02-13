package DependencyInjection;

import Pet.Animal;

public class Employee {
    private Animal pet;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public Employee(Animal pet) {
        this.pet = pet;
    }


    public void couldYourPet() {
        System.out.println("Call a pet ");
        pet.say();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
