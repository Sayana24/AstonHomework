package homework1.part1;

public class Hero {
    String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.print(this.getName() + " атакует врага.     ");
        enemy.takeDamage(10);
    }
}
