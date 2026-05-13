package flyweight.spitalA10.clase;

public class Pacient implements IPacient{

    private int codPacient;
    private String nume;
    private String telefon;
    private String adresa;

    public Pacient(int codPacient, String nume, String telefon, String adresa) {
        this.codPacient = codPacient;
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public void descriere(Internare internare) {
        System.out.println("Pacientul cu codul "+codPacient+" si numele "+nume+
                " , telefon: "+telefon+", adresa: "+adresa+
                " a fost internat "+internare.toString());
    }
}
