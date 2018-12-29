package patterns.builder;

public class Main {
    public static void main(String[] args) {
//        Computer computer = new Computer();
//        computer.setManipulators("");
//        computer.setSystemBlock("");
//        computer.setDisplay("");

        Director director = new Director();
        ComputerBuilder computerBuilder = new SomeComputerBulder();
        director.setComputerBuilder(computerBuilder);
        director.constructComputer();
        Computer computer = director.getComputer();
        System.out.println(computer);

    }
}
