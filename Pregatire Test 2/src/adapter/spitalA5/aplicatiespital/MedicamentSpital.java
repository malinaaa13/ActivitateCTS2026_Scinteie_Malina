package adapter.spitalA5.aplicatiespital;

public class MedicamentSpital {
    private String denumire;
    private int miligrame;

    public MedicamentSpital(String denumire, int miligrame) {
        this.denumire = denumire;
        this.miligrame = miligrame;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()) {
            System.out.println("Medicamentul " + this.denumire +
                    " " + this.miligrame + " mg a fost achizitionat cu succes!");
        } else{
            System.out.println("Aveti nevoie de reteta");
        }
    }

    protected boolean prezintaReteta(){
        return true;
    }
}
