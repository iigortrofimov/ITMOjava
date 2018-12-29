package lesson10.homework.classes;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strenght;


    public Cat(String name, int age, int weight, int strenght) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strenght = strenght;
    }

    public double power(){
        return age * (weight * 0.1) * strenght;

    }

    public boolean fight(Cat anotherCat){
//        double power = this.age * (this.weight * 0.1) * this.strenght;
//        double power2 = anotherCat.age * (anotherCat.weight * 0.1) * anotherCat.strenght;
//        System.out.println(power);
//        System.out.println(power2); второй варинт power!

        return this.power() > anotherCat.power();
    }
}
