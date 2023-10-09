package lotr;

import java.util.Random;

public class Knight extends Character{
    
    Random rand = new Random();

    public Knight() {
        super(0, 0);
        this.hp = rand.nextInt(10) + 2;
        this.power = rand.nextInt(10) + 2;
    }

    public void kick(Character c) {
        c.power -= rand.nextInt(power);
    }
}