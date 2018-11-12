package lesson5.BattleUnit;

public class main {
    public static void main(String[] args) {
        //BattleUn battleUn = new BattleUn(90,20);
        BattleUn spearman = new Spearmen(200, 50);
        BattleUn knight = new Knight(150, 100);
        knight.attack(spearman);
        System.out.println(spearman.isAlive() + " " + spearman.health);


    }
}
