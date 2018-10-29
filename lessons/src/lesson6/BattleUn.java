package lesson6;

public class BattleUn {
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

    public void attack (BattleUn enemy){
        enemy.health -= this.attackScore;
    }
}
