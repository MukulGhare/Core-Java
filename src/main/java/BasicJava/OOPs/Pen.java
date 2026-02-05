package OOPs;

class Pen {
    static int counter = 0;
    String Colour;
    String type;

    void write() {
        System.out.println("Pen is writing");
    }

    Pen() {
        counter++;
    }

    void printPenProperties() {
        System.out.println("Pen colour is - " + this.Colour);
        System.out.println("Pen colour is - " + this.type);
    }

    static void getPenCount(){
        System.out.println(counter);
    }
}