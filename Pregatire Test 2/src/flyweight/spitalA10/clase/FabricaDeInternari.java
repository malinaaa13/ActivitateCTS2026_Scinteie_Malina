package flyweight.spitalA10.clase;

import java.util.HashMap;

public class FabricaDeInternari {

    private HashMap<Integer, IPacient> pacienti;

    public FabricaDeInternari(){
        this.pacienti = new HashMap<Integer, IPacient>();
    }

    public IPacient getPacient(int codPacient) throws Exception{
        IPacient pacient = pacienti.get(codPacient);
        if(pacient == null){
            throw new Exception("Nu exista pacientul");
        }
        return pacient;
    }

    public IPacient getPacient(int codPacient, String nume, String telefon, String adresa){
        IPacient pacient = pacienti.get(codPacient);
        if(pacient == null){
            pacient = new Pacient(codPacient, nume, telefon, adresa);
            pacienti.put(codPacient, pacient);
        }
        return pacient;
    }
}
