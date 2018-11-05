package lesson6.BattleIUnit;

public interface InterfaceForBattleUnit {
    void say (String text); // все будличные все абстрактные + все контстантные значения( не изм)
    void sing (String song); // не для описания свойств // с java 9 доступно privat

    default void greeting(){ // default метод с реализацией
        System.out.println("Hello");
    }
}
