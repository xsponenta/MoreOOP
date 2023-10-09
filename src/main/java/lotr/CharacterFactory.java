package lotr;

import java.util.Random;

class CharacterFactory {

    Random rand = new Random();

    public Character createCharacter() {
        int numb = rand.nextInt(3);
        if (numb == 0) {
            return new Hobbit();
        }
        if (numb == 1) {
            return new Elf();
        }
        if (numb == 2) {
            return new King();
        }
        return new Knight();
    }
}