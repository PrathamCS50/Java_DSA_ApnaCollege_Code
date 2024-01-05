public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Bear b = new Bear();
        b.eath();
        b.eatc();

    }
}

interface ChessPlayer {
    void moves(); // Public abstract
    // blueprint of class
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down , left , right,diagonal (in all 4 direcftions) ");
    }
}

class Rook implements ChessPlayer {
    public void moves() { // public keyword wirtten as by default the type is default
        System.out.println("Up, Down, left, right ");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down , left , right,diagonal (by 1 step.) ");
    }
}

interface Herbivore {
    void eath();
}

interface Carnnivore {
    void eatc();
}

class Bear implements Herbivore, Carnnivore {
    public void eath() {
        System.out.println("It eats Grass.");
    }

    public void eatc() {
        System.out.println("It eats small insects , fish.");
    }
}