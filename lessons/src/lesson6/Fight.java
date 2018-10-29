package lesson6;

public class Fight {
    private BattleUn unit1;
    private BattleUn unit2;

    public Fight(BattleUn unit1, BattleUn unit2) {
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public void fight(){
        while (unit1.isAlive() && unit2.isAlive()){
            unit1.attack(unit2);
            if (unit2.isAlive()){
                unit2.attack(unit1);
            }
        }
    }

    public String fightResult(){
        return "Health юнита 1 = " + unit1.getHealth() + " " + "Health юнита 2 = " + unit2.getHealth();



    }
}

