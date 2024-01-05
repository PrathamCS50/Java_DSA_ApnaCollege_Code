
public class Abstraction {
    public static void main(String[] args) {
        // Abstract class ke ojects create nhi kar sakte
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println();

        System.out.println(h.color);
        h.ChangeColor();
        System.out.println(h.color);

        Mustang myhorse = new Mustang();
        myhorse.eat();
    }

}

abstract class Animal {
    // Abstract class ke hum objects nhi bna skte
    String color;

    Animal() {
        System.out.println("Animal constructor called...");
        color = "Brown";
    }

    void eat() {
        System.out.println("Eats");
    }

    abstract void walk();
    // Abstract class hai , isliye aage ke subclasses iss function ke bare mein bata
    // degi
    // Idea de diya ki ye function har sub class mein hina chahiye and each one can
    // declare its own

}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor called...");
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }

    void ChangeColor() {
        color = "Dark Brown";
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor called... ");
    }

    void walk() {
        System.out.println("Also walks on 4 legs.");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken Comstructor called ... ");
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }

    void ChangeColor() {
        color = "Yellow";
    }
}