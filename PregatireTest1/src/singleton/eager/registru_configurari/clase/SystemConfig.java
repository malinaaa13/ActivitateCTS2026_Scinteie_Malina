package singleton.eager.registru_configurari.clase;

public class SystemConfig {
    private String ipServer;
    private int port;
    private String numeAplicatie;

    private static final SystemConfig instanta = new SystemConfig("123.34.5", 8080, "yahoo");

    private  SystemConfig(String ipServer, int port, String numeAplicatie)
    {
        this.ipServer=ipServer;
        this.port = port;
        this.numeAplicatie = numeAplicatie;
    }

    public static SystemConfig getInstance(){
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SystemConfig{");
        sb.append("ipServer='").append(ipServer).append('\'');
        sb.append(", port=").append(port);
        sb.append(", numeAplicatie='").append(numeAplicatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setIpServer(String ipServer) {
        this.ipServer = ipServer;
    }

    public void setNumeAplicatie(String numeAplicatie) {
        this.numeAplicatie = numeAplicatie;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
