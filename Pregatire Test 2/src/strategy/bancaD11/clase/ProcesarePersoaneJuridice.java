package strategy.bancaD11.clase;

public class ProcesarePersoaneJuridice implements ModProcesare{
    @Override
    public void verifica(String nume) {
        System.out.println("S-au verificat actele de infiintare a firmei si inregistrarea la Registrul comertului pentru "+nume);
    }
}
