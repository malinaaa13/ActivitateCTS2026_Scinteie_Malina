package proxy.proxy;

import proxy.clase.ISpital;
import proxy.clase.Pacient;
import proxy.clase.Spital;

public class ProxyCuAsigurare implements ISpital {
    private ISpital spital;

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneazaPacient(pacient);
        } else{
            System.out.println("Pacientul nu are asigurare");
        }
    }

    public ProxyCuAsigurare(ISpital spital) {
        this.spital = spital;
    }
}
