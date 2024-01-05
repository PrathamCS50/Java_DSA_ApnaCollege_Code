public class Polymorphism {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // COMPILE TIME POLYMORPHISM
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.5f, 2.5f));
        System.out.println(calc.sum(1, 2, 3));
        // COMPILE TIME POLYMORPHISM END

        // RUN TIME POLYMORPHISM
        Deer d = new Deer();
        d.eat();

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void eat() {
        System.out.println("Eats Anything.");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass.");
    }
}
