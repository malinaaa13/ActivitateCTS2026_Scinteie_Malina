package adapter.spitalA5.aplicatie_spital;

public class MedicamentSpital {
    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Medicament achizitionat");
        }else{
            System.out.println("Este nevoie de o reteta valida pentru a cumpara medicamentul");
        }
    }

    protected boolean prezintaReteta(){
        return true;
    }
}
