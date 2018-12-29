package lesson7.homework;

import java.util.Arrays;

public class Pupil {
    int id; // id студента
    private ExamResult exams[]; // результат экзамена

    public Pupil(int id) { // конструктор для экземплята класса Pupil
        this.id = id;
    }

    private class ExamResult { // внутренний класс
        private String name;
        private int mark;
        private boolean passed;

        public ExamResult(String name) {
            this.name = name;
            this.passed = false;
        }

        public void passExam() { // метод - "Экзамен сдан"
            passed = true;
        }

        public int getMark() {
            return mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }

        public int getPassedMark() { // возвращает минимальную оценку сдачи экзамена
            final int PASSED_MARK = 3;//
            return PASSED_MARK;
        }

        public String getName() {
            return name;
        }

        public boolean isPassed() {
            return passed;
        }
    }

    public void setExams(String[] name, int[] marks) { // метод который
        exams = new ExamResult[name.length];// создается объект класса ExamResult
        // длина данного массива равно длине массива названий предметов

        for (int i = 0; i < name.length; i++) {
            exams[i] = new ExamResult(name[i]);
            exams[i].setMark(marks[i]);
            if (exams[i].getMark() >= exams[i].getPassedMark())
                exams[i].passExam();
        }
    }

    public String toString() {
        String res = "Ученик: " + id + "\n";
        for (int i = 0; i < exams.length; i++)
            if (exams[i].isPassed())
                res += exams[i].getName() + " сдал \n";
            else
                res += exams[i].getName() + " не сдал \n";
        return res;
    }
}

