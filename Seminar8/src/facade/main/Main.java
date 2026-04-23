package facade.main;

import facade.clase.Medic;
import facade.clase.Pacient;
import facade.clase.Salon;
import facade.facade.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Maria", 7);
        Pacient pacient2 = new Pacient("Tudor", 2);
        Pacient pacient3 = new Pacient("Ilinca", 5);
        Pacient pacient4 = new Pacient("Oana", 8);
        Medic medic = new Medic("Irina");
        Salon salon = Salon.getInstance();

        if(pacient.getGravitate() >= 4){
            if(medic.areBiletDeTrimitere(pacient)){
                int nrPat = salon.suntPaturiLibere();
                if(salon.suntPaturiLibere()!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" poate fi internat in patul "+ nrPat);
                    salon.OcupaPat(nrPat);
                }
            }
        }

        SpitalFacade facade = new SpitalFacade(new Medic("Elena"), Salon.getInstance());
        facade.interneazaPacient(pacient2);
        facade.interneazaPacient(pacient3);
        facade.interneazaPacient(pacient4);
    }
}
