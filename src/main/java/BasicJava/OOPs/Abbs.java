package OOPs;

//import Polymorphism.Animal2;

class Horse extends Polymorphism.Animal2 {

    public void walk(){
        System.out.println("Horse is walking !");
    }

}

class Chicken extends Polymorphism.Animal2 {
    public void walk(){
        System.out.println("Chicken is walking !");
    }
}

public class Abbs {

    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk();
        
    }

}
