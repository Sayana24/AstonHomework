package homework1.part1;

public class Enemy {
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


}
