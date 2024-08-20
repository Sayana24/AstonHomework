package homework1.part1;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(150);
        Hero adam = new Hero("Adam");
        adam.attackEnemy(enemy);
        Hero bob = new Hero("Bob");
        bob.attackEnemy(enemy);
        Warrior vasya = new Warrior("Vasya");
        vasya.attackEnemy(enemy);
        Mage maggy = new Mage("Maggy");
        maggy.attackEnemy(enemy);
        Archer chingis = new Archer("Chingis");
        chingis.attackEnemy(enemy);
    }
}
