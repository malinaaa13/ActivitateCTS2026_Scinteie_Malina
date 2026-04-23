package facade.facade;

import facade.clase.Medic;
import facade.clase.Pacient;
import facade.clase.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public void interneazaPacient(Pacient pacient){
        if(pacient.getGravitate() >= 4){
            if(medic.areBiletDeTrimitere(pacient)){
                int nrPat = salon.suntPaturiLibere();
                if(salon.suntPaturiLibere()!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" poate fi internat in patul "+ nrPat);
                    salon.OcupaPat(nrPat);
                } else {
                    System.out.println("Nu mai sunt paturi libere");
                }
            } else {
                System.out.println("Pacientul "+ pacient.getNume()+ " are nevoie de un bilet de trimitere de la medic");
            }
        } else{
            System.out.println("Gravitatea pacientului nu e suficent de mare");
        }
    }


    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }
}
