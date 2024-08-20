package homework1.part2;

public class MageAbst extends HeroAbst {
    public MageAbst(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.print("Маг " + this.getName() + " атакует врага.     ");
        if (enemy.isAlive()) {
            enemy.takeDamage(7);
        } else {
            System.out.println("Враг уже повержен");
        }

    }
}