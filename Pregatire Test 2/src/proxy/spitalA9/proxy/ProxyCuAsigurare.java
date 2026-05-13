package proxy.spitalA9.proxy;

import proxy.spitalA9.clase.ISpital;
import proxy.spitalA9.clase.Pacient;
import proxy.spitalA9.clase.Spital;

public class ProxyCuAsigurare implements ISpital {

    private ISpital spital;

    public ProxyCuAsigurare(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneazaPacient(pacient);
        } else{
            System.out.println("Pacientul nu are asigurare si nu poate fi internat");
        }
    }
}
