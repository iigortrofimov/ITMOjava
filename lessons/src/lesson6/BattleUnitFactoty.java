package lesson6;

public class BattleUnitFactoty {
    public BattleUn create(String userChoise) {
        if (userChoise.equals("knight")) {
            return new Knight(100, 22);
        }
        if (userChoise.equals("spearmen")) {
            return new Spearmen(233, 10);
        }
            return new Doctor(90, 10); // else не нужны

    }
}
