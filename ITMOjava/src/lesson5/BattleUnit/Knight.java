package lesson5.BattleUnit;

public class Knight extends BattleUn {
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
}
