package builder.agentie_v1.main;

import builder.agentie_v1.clase.PachetBuilder;
import builder.agentie_v1.clase.PachetTransport;

public class Main {
    public static void main(String[] args) {
        PachetTransport pachetTransport = new PachetTransport();
        System.out.println(pachetTransport);

        PachetBuilder builder = new PachetBuilder(new PachetTransport());
        PachetTransport pachet2 = builder.setAreWifi(true).setAreAnimale(true).build();
        System.out.println(pachet2.toString());

    }
}
