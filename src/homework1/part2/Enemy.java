package homework1.part2;

public class Enemy implements Mortal {
    int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        int newHealth = this.getHealth() - damage;
        System.out.println("Враг получил удар. Здоровье = " + newHealth);
        this.setHealth(newHealth);
    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}