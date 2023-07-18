package io.zipcoder.polymorphism;

import java.util.*;
import io.zipcoder.polymorphism.Pet;
import io.zipcoder.polymorphism.Dog;
import io.zipcoder.polymorphism.Cat;
import io.zipcoder.polymorphism.Penguin;

public class MainApplication {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numPets = input.nextInt();
        List<Pet> petList = new ArrayList<>();

        for (int i = 0; i < numPets; i++){
            String petType;
            if (i == 0){
                System.out.println("What is your first pet? (Please enter one of the following: 'dog', 'cat', or 'penguin'");
            }
            else {
                System.out.println("What is your next pet? (Please enter one of the following: 'dog', 'cat', or 'penguin'");
            }

            petType = input.next();

            if (petType.equals("dog")){
                System.out.println("Please enter your dog's name:");
                String name = input.next();
                Dog dog1 = new Dog(name);
                petList.add(dog1);
            }
            else if (petType.equals("cat")){
                System.out.println("Please enter your cat's name:");
                String name = input.next();
                Cat cat1 = new Cat(name);
                petList.add(cat1);
            }
            else if (petType.equals("penguin")){
                System.out.println("Please enter your penguin's name:");
                String name = input.next();
                Penguin penguin1 = new Penguin(name);
                petList.add(penguin1);
            }

        }

        for (int i = 0; i < petList.size(); i++){
            System.out.print("This pet is " + petList.get(i).getName() + ". ");
            System.out.println("They say '" + petList.get(i).speak() + "'!");
        }

    }



}
