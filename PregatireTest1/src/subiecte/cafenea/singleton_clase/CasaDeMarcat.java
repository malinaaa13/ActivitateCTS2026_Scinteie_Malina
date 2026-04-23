package subiecte.cafenea.singleton_clase;

import subiecte.cafenea.factory_clase.IBautura;

import java.util.List;

public class CasaDeMarcat implements IComandaManager{
    private List<IBautura> listaBauturi;

    private static CasaDeMarcat instanta = null;

    private CasaDeMarcat(List<IBautura> listaBauturi) {
        this.listaBauturi = listaBauturi;
    }

    @Override
    public void adaugaBautura(IBautura bautura) {
        this.listaBauturi.add(bautura);
        System.out.println("Am adaugat in comanda "+bautura.getDetalii());
    }

    @Override
    public void afiseazaComandaCurenta() {
        if(listaBauturi != null && !listaBauturi.isEmpty()){
            System.out.println("Afisare comanda curenta");
            for(IBautura b : listaBauturi) {
                System.out.println("- "+b.getDetalii());
            }
        } else {
            System.out.println("Comanda nu contine nici o bautura!");
        }
    }

    @Override
    public double calculeazaPretTotal() {
        double total = 0.0;
        for(IBautura b : listaBauturi){
            total+= b.getPret();
        }
        return total;
    }

    @Override
    public void finalizeazaComanda() {
        System.out.println("Comanda finalizata. Total de plata: "+calculeazaPretTotal());
        this.listaBauturi.clear();
    }

    public static CasaDeMarcat getInstance(List<IBautura> listaBauturi){
        if(instanta == null){
            instanta = new CasaDeMarcat(listaBauturi);
        }
        return instanta;

    }
}
