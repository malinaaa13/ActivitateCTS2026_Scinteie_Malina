package strategy.bancaD11.clase;

public class ProcesarePersoaneFizice implements ModProcesare{
    @Override
    public void verifica(String nume) {
        System.out.println("S-au verificat buletinul si adeverinta de munca pentru "+nume);

    }
}
