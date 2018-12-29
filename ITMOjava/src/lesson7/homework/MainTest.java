package lesson7.homework;

public class MainTest {
    public static void main(String[] args) {
        Pupil stud = new Pupil(101);

        String ex[] = {"Mатематика","Информатика", "История"};

        int marks[] = { 3, 5, 2 };

        stud.setExams(ex, marks);

        System.out.println(stud);



    }
}
