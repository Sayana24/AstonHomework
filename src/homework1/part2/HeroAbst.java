package homework1.part2;

public abstract class HeroAbst {
    String name;

    public HeroAbst(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void attackEnemy(Enemy var1);
}
