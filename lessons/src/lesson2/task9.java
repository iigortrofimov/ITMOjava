package lesson2;

public class task9 {
    public static void main(String[] args) {
        double plates = 231.0;
        double cleaner = 12.0;
        for (int i = 0; i < plates; i++)
        {
            cleaner = cleaner - 0.5;
            if (cleaner >= 0)
            {
                System.out.println("оставлось: " + cleaner);
            }
            else if (cleaner < 0)
            {
                System.out.println("не хватило: " + Math.abs(cleaner));
            }
        }
        if (cleaner < 0)
        {
            System.out.println("не помыто: " + (int)Math.abs(cleaner) * 2 + " тарелок");
        }
        if (cleaner >= 0)
        {
            System.out.println("не израсходовано: " + Math.abs(cleaner)  + " моющего средства");
        }
    }
}
