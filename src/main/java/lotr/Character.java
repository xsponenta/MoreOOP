package lotr;

public class Character {
    protected int power;
    protected int hp;

    Character(int power, int hp)  {
        this.hp = hp;
        this.power = power;
    }
    public void kick(Character c) {
        this.hp -= c.hp;
    }

    boolean isAlive() {
        return (this.hp > 0);
    }

    public int getHp() {
        return this.hp;
    }

    public int getPower() {
        return this.power;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
            return;
        }
        this.hp = hp;
    }

    public void getHp(int power) {
        this.power = power;
    }

    public String toString() {
        return this.getClass().getSimpleName() + String.format("{hp=%d, power=%d}", this.hp, this.power);
    }
}
