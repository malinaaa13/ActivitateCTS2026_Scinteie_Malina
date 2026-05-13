package strategy.examen.clase;

public class Student {
    private ModSustineere modSustineere;
    private String nume;

    public Student(ModSustineere modSustineere) {
        this.modSustineere = modSustineere;
    }

    public Student(String nume){
        this.nume = nume;
        this.modSustineere = new Grila();
    }

    public void setModSustineere(ModSustineere modSustineere) {
        this.modSustineere = modSustineere;
    }

    public void examinare(){
        modSustineere.sustineExamen();
    }
}
