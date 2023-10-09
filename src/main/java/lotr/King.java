package lotr;

import java.util.Random;

public class King extends Character{
    
    Random rand = new Random();

    public King() {
        super(0, 0);
        this.hp = rand.nextInt(10) + 5;
        this.power = rand.nextInt(10) + 5;
    }

    public void kick(Character c) {
        c.power -= rand.nextInt(power);
    }
}