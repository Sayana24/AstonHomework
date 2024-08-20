package homework1.part1;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.print("Маг " + this.getName() + " атакует врага.     ");
        enemy.takeDamage(7);
    }
}
