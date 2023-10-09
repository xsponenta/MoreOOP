package lotr;


public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3);
    }

    void kick() {
        toCry();
    }

    void toCry() {
        System.out.println("Cries");
    }

}