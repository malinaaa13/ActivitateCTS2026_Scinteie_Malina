package builder.agentie_v2.main;

import builder.agentie_v2.clase.Builder;
import builder.agentie_v2.clase.PachetTuristic;

public class Main {
    public static void main(String[] args){
        PachetTuristic pachet1 = new PachetTuristic(false, true, true, false, false);
        System.out.println(pachet1);

        Builder builder = new Builder();
        PachetTuristic pachet2 = builder.setAreWifi(true).build();
        System.out.println(pachet2);
    }
}
