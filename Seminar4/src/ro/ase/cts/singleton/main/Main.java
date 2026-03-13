package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.Logger;

public class Main {
    public static void main(String[] args){
        Logger instanta = Logger.getInstanta("Interfata", "afisare");
        instanta.afiseazaLog("fisierul json nu este afisat corect");
        instanta.afiseazaLog("Eroare");
        Logger instanta2 = Logger.getInstanta("Backend", "baza de date");
        instanta2.afiseazaLog("eroare");
        //instanta2 este tot instanta, e aceasi doar am 2 referinte la aceasta
        //daca totusi vreau sa apare din partea backend ului folosesc setter
        instanta2.setCategorie("baza de date");
        instanta2.setSender("Backend");
        instanta2.afiseazaLog(" eroare la inserare ");
        //Logger instanta3 = new Logger("client", "afisare"); //trebuie sa dea eroare, pt ca constructorul e private
        // pt testare trb apelat de cel putin 2 ori getInstanta ca sa vedem ca ne da aceasi instanta

    }
}
