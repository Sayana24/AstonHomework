package homework1.part1;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.print("Лучник " + this.getName() + " атакует врага.     ");
        enemy.takeDamage(9);
    }
}