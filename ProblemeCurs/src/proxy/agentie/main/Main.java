package proxy.agentie.main;

import proxy.agentie.clase.PachetTransport;
import proxy.agentie.clase.Persoana;
import proxy.agentie.clase.ProxyPachet;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Popovici", 34);
        PachetTransport pachetTransport = new PachetTransport(persoana);
        pachetTransport.rezervaPachet();

        ProxyPachet pachetTransportProxy = new ProxyPachet(persoana);
        pachetTransportProxy.rezervaPachet();
    }
}
