package strategy.main;

import strategy.clase.ProbaOrala;
import strategy.clase.ProbaScrisa;
import strategy.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Maria");
        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();

        //strategy permite modificarea algoritmului(modului de examinare) la runtime!!

    }
}
