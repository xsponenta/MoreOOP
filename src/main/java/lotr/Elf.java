package lotr;


public class Elf extends Character{
    
    public Elf() {
        super(10 ,10);
    }


    public void kick(Character c) {
        if (this.power > c.power) {
            c.hp = 0;
        }
        else {
            c.power -= 1;
        }
    }
}