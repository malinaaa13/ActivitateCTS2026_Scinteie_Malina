package flyweight.agentie.program;

import flyweight.agentie.clase.FabricaDePachete;
import flyweight.agentie.clase.Optionale;
import flyweight.agentie.clase.PachetTuristic;

public class Program {
    public static void main(String[] args) {
        FabricaDePachete fabricaPachete = new FabricaDePachete();
        Optionale optional1 = new Optionale(3, true);
        Optionale optional2 = new Optionale(3, false);
        Optionale optional3 = new Optionale(1, true);
        Optionale optional4 = new Optionale(5, true);

        PachetTuristic pachet = (PachetTuristic) fabricaPachete.getPchetTuristic(1);
        pachet.descriePachet(optional1);
        fabricaPachete.getPchetTuristic(2).descriePachet(optional2);
        optional2.setNumarExcursii(40);
        fabricaPachete.getPchetTuristic(2).descriePachet(optional2);
        fabricaPachete.getPchetTuristic(1).descriePachet(optional4);

        System.out.println(fabricaPachete.getNumarPachete());

    }
}
