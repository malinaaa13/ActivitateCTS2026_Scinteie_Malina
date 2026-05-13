package strategy.examen.main;

import strategy.examen.clase.ProbaOrala;
import strategy.examen.clase.ProbaScrisa;
import strategy.examen.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Maria");
        student.examinare();

        student.setModSustineere(new ProbaOrala());
        student.examinare();

        student.setModSustineere(new ProbaScrisa());
        student.examinare();
    }
}
