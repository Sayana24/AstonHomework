package homework1.part2;

public class WarriorAbst extends HeroAbst {
    public WarriorAbst(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.print("Воин " + this.getName() + " атакует врага.     ");
        if (enemy.isAlive()) {
            enemy.takeDamage(5);
        } else {
            System.out.println("Враг уже повержен");
        }

    }
}