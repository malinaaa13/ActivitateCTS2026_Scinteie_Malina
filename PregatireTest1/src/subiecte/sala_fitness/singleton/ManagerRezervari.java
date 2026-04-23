package subiecte.sala_fitness.singleton;

import java.util.List;

public class ManagerRezervari {
    private List<Rezervare> rezervari;

    private static ManagerRezervari instanta = null;

    private ManagerRezervari(List<Rezervare> rezervari) {
        this.rezervari = rezervari;
    }

    public static ManagerRezervari getInstance(List<Rezervare> rezervari){
        if(instanta == null){
            instanta = new ManagerRezervari(rezervari);
        }
        return instanta;
    }

    public void setRezervari(List<Rezervare> rezervari) {
        this.rezervari = rezervari;
    }

    public void adaugareRezervare(Rezervare rezervare){
        if( rezervare!= null){
            rezervari.add(rezervare);
            System.out.println("Rezervare adaugata cu succes!");
        } else {
            System.out.println("Rezervare invalida!");
        }
    }

    public void afisareRezervari(){
        for(Rezervare r : rezervari){
            System.out.println(r.toString());
        }
    }

}
