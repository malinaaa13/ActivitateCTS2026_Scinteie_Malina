package singleton.static_block.clase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SystemConfig {
    private String ipServer;
    private int portSsl;
    private String versiuneProtocol;

    private static SystemConfig instanta;

    static {
    try{
        BufferedReader reader = new BufferedReader(new FileReader("config.txt"));
        String ip = reader.readLine().trim();
        String portRaw = reader.readLine().trim();
        int port = Integer.parseInt(portRaw);
        String versiune = reader.readLine().trim();

        instanta = new SystemConfig(ip, port, versiune);
    } catch (Exception e) {
        System.out.println("Eroare la citirea configurarii "+e.getMessage());
        instanta = new SystemConfig("localhost", 8080, "HTTP");
    }
    }

    private SystemConfig(String ipServer, int portSsl, String versiuneProtocol) {
        this.ipServer = ipServer;
        this.versiuneProtocol = versiuneProtocol;
        this.portSsl = portSsl;
    }

    public static SystemConfig getInstance() {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SystemConfig{");
        sb.append("ipServer='").append(ipServer).append('\'');
        sb.append(", portSsl=").append(portSsl);
        sb.append(", versiuneProtocol='").append(versiuneProtocol).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setVersiuneProtocol(String versiuneProtocol) {
        this.versiuneProtocol = versiuneProtocol;
    }
}
