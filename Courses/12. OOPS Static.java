public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "dps";

        Student s2 = new Student();
        System.out.println(s2.schoolName);  //Got dps kyuki vo static tha and ek bar decalre kr diya tha usko

        Horse h = new Horse();
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor is called... ");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        System.out.println("Horse constructoris called...");
    }
}
