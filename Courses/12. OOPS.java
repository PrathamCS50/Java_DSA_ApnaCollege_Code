public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(4);
        System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Pratham Goel";
        myAcc.setPassword("asds");

        Student s1 = new Student("Pratham Goel");
        System.out.println(s1.name);
        Student s2 = new Student();
        Student s3 = new Student(123);
        s1.name = "Pratham G";
        s1.roll = 7042;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        
        Student s4 = new Student(s1); // Copy contents
        s2.password = "xyz";
        s1.marks[2] = 100;
        s3.age=12;

        for (int i = 0; i < 3; i++) {
            System.out.print(s4.marks[i] + " ");
        }

    }
}

class Student {
    String name;
    float percentage;
    int age;
    int roll;
    String password;
    int marks[];

    // // SHALLOW COPY CONSTRUCTOR
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // DEEP COPY CONSTRUCTOR
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() { // Non Parametrized constructor
        marks = new int[3];
        System.out.println("Constructor is called... ");
    }

    Student(String name) {  //{Paramaterised constructor}
        marks = new int[3];
        this.name = name;
        System.out.println("Hey, " + name);
    }

    Student(int roll) {     //{Paramaterised constructor}
        marks = new int[3];
        this.roll = roll;
        System.out.println(roll);
    }

    void caclPercentage(int m1, int m2, int m3) {
        percentage = (m1 + m2 + m3) / 3;
    }
}

class Pen {
    //Private kr liya attributes ko and define kar diya setters and getters ko
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
