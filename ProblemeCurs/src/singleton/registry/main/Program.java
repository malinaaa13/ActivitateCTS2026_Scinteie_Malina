package singleton.registry.main;

import singleton.registry.clase.PachetCazare;
import singleton.registry.clase.PachetTransport;
import singleton.registry.clase.RegistryPachete;

public class Program {
    public static void main(String[] args) {
        PachetCazare cazare = new PachetCazare();
        PachetCazare cazare2 = new PachetCazare();
        PachetTransport transport = new PachetTransport();

        try{
            RegistryPachete.register("Cazare", cazare);
            RegistryPachete.register("Transport", transport);

            //RegistryPachete.register("Cazare", cazare2);

            RegistryPachete.getPachet("Cazare").descriere();
            RegistryPachete.getPachet("Transport").descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
