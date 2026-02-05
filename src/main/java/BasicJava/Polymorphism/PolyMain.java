package Polymorphism;

import java.util.Scanner;

public class PolyMain {
    public static void main(String[] args) {
        Animal animal;
        Scanner scan = new Scanner(System.in);

        System.out.println("What type of Animal do you want to create ?");
        System.out.println("1. Dog" + "\n" + "2. Cat");

        int userChoice = scan.nextInt();

        if (userChoice == 1) {
            animal = new Dog();
        } else if(userChoice == 2) {
            animal = new Cat();
        } else {
            animal = new Animal();
        }
        
        animal.speak();
        scan.close();

    }
}
