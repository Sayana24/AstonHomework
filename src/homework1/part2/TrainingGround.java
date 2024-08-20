package homework1.part2;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(150);

        WarriorAbst warriorAbst = new WarriorAbst("Warrior from Abstract class ");
        warriorAbst.attackEnemy(enemy);
        MageAbst mageAbst = new MageAbst("Mage from Abstract class ");
        mageAbst.attackEnemy(enemy);
        ArcherAbst archerAbst = new ArcherAbst(" Archer from Abstract class ");
        archerAbst.attackEnemy(enemy);
        archerAbst.attackEnemy(enemy);
        mageAbst.attackEnemy(enemy);

        for(int i = 0; i < 15; ++i) {
            archerAbst.attackEnemy(enemy);
        }

    }
}
