public class Inheritence {

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        Bird bobby = new Bird();
        System.out.println();
        bobby.fly();
        bobby.color = "White";
        bobby.eat();

    }
}

// BASE CLASS
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// DERIVED CLASS
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}

class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("Walks");
    }
}

class Dog extends Animal {
    String breed;
    int legs;
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flies in sky.");
    }
}
