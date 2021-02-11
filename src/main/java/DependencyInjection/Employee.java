package DependencyInjection;

import Pet.Animal;

public class Employee {
    private Animal pet;


    public Employee(Animal pet) {
        this.pet = pet;
    }


    public void couldYourPet() {
        System.out.println("Call a pet ");
        pet.say();
    }
}
