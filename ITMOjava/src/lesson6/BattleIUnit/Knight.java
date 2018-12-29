package lesson6.BattleIUnit;

public class Knight extends BattleUn implements InterfaceForBattleUnit{
    public Knight(int heealth, int attackScore) {
        super(heealth, attackScore); // обращение к методам родителям
    }

    private void addHeath(){
        if(this.health > 1){
            this.health += 5;
        }
    }
    @Override  // расширение родительского метода  (переопредление)
    public void attack (BattleUn enemy){
        enemy.health -= this.attackScore;
        addHeath();
    }

    @Override
    public void say(String text) {
        System.out.println("Рыцарь сказал: " + text);
    }

    @Override
    public void sing(String song) {
        System.out.println("Песня рыцаря " + song);

    }


}
