package facade.spitalA6.fatada;

import facade.spitalA6.clase.Medic;
import facade.spitalA6.clase.Pacient;
import facade.spitalA6.clase.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        if(pacient.getStare() >= 4){
            if(medic.necesitaInternare(pacient)){
                int nrPat = salon.suntPaturiLibere();
                if(salon.suntPaturiLibere()!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" poate fi internat in patul "+nrPat);
                    salon.ocupaPat(nrPat);
                } else {
                    System.out.println("Nu mai sunt paturi libere");
                }
            } else{
                System.out.println("Pacientul "+pacient.getNume()+" nu necesita internare");
            }
        } else{
            System.out.println("Gravitatea starii nu este suficient de mare");
        }
    }
}
