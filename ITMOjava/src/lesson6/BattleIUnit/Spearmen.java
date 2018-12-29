package lesson6.BattleIUnit;

public class Spearmen extends BattleUn implements InterfaceForBattleUnit  {
    public Spearmen(int heealth, int attackScore) {
        super(heealth, attackScore);
    }
    @Override
    public void attack (BattleUn enemy){
        enemy.health -= this.attackScore;

    }

    @Override
    public void say(String text) {
        System.out.println("Копейщик сказал " + text);
    }

    @Override
    public void sing(String song) {
        System.out.println("Песня копейщика" + song);

    }


}
