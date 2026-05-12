package flyweight.agentie.clase;

import java.util.HashMap;

public class FabricaDePachete {
    private HashMap<Integer, IPachetTuristic> pacheteTuristice;

    public FabricaDePachete(){
        this.pacheteTuristice = new HashMap<Integer, IPachetTuristic>();
    }

    public int getNumarPachete(){
        return pacheteTuristice.size();
    }

    public IPachetTuristic getPchetTuristic(int codPachet){
        IPachetTuristic pachet = pacheteTuristice.get(codPachet);
        if(pachet == null){
            pachet = new PachetTuristic(codPachet, "Hotel", "OrasTuristic", true);
            pacheteTuristice.put(codPachet, pachet);
        }
        return pachet;
    }
}
