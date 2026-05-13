package strategy.bancaD11.clase;

public class Client {
    private ModProcesare modProcesare;
    private String nume;

    public Client(ModProcesare modProcesare, String nume) {
        this.modProcesare = modProcesare;
        this.nume = nume;
    }

    public void setModProcesare(ModProcesare modProcesare) {
        this.modProcesare = modProcesare;
    }

    public void verificareDocumente(){
        modProcesare.verifica(nume);
    }
}
