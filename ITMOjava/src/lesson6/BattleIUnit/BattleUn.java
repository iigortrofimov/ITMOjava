package lesson6.BattleIUnit;

abstract public class BattleUn implements InterfaceForBattleUnit{
 //   private int health;
 //  private int attackScore;
    protected int health;
    protected int attackScore;

    public BattleUn(int heealth, int attackScore) {
        this.health = heealth;
        this.attackScore = attackScore;
    }

    public boolean isAlive(){
        return health > 0;
    }

    abstract public void attack (BattleUn enemy); // метод при реализации доступны только в абстрактом классе
    // на основе такого класса нельзя создать объект


    public int getHealth() {
        return health;
    }

    public int getAttackScore() {
        return attackScore;
    }
}
