package homework1.part2;

public class ArcherAbst extends HeroAbst {
    public ArcherAbst(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.print("Лучник " + this.getName() + " атакует врага.     ");
        if (enemy.isAlive()) {
            enemy.takeDamage(9);
        } else {
            System.out.println("Враг уже повержен");
        }

    }
}