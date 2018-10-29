package lesson6;

public class Doctor extends BattleUn implements InterfaceForBattleUnit{ // интерфейсов моэнт быть несколько
    public Doctor(int heealth, int attackScore) {
        super(heealth, attackScore);
    }
    @Override
    public void attack (BattleUn enemy){


    }

    @Override
    public void say(String text) {

    }

    @Override
    public void sing(String song) {

    }



}
