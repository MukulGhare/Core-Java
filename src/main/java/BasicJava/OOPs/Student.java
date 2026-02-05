package OOPs;

public class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    // Default non para constructor
    Student(){
        System.out.println("non para construstor called !");
    }

    // paramerized constructor
    Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    // copy Constructor
    Student( Student s){
        this.name = s.name;
        this.age = s.age;
    }

    // Java does not require destructors as it has garbage collector
}
