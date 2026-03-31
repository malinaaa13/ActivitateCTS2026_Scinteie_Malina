package singleton.lazy.clase;

public class DatabaseConnection {
    private String denumireBazaDate;
    private int nrConexiuniActive;
    private String statusConexiune;

    private static  DatabaseConnection instanta = null;

    private DatabaseConnection(String denumireBazaDate, int nrConexiuniActive, String statusConexiune) {
        this.denumireBazaDate = denumireBazaDate;
        this.nrConexiuniActive = nrConexiuniActive;
        this.statusConexiune = statusConexiune;
        System.out.println("S-a apelat constructorul! Conexiunea a fost creata");
    }

    public synchronized static DatabaseConnection getInstance(String denumireBazaDate, int nrConexiuniActive, String statusConexiune) {
        if( instanta == null) {
            instanta = new DatabaseConnection(denumireBazaDate, nrConexiuniActive, statusConexiune);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DatabaseConnection{");
        sb.append("denumireBazaDate='").append(denumireBazaDate).append('\'');
        sb.append(", nrConexiuniActive=").append(nrConexiuniActive);
        sb.append(", statusConexiune='").append(statusConexiune).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setDenumireBazaDate(String denumireBazaDate) {
        this.denumireBazaDate = denumireBazaDate;
    }

    public void setNrConexiuniActive(int nrConexiuniActive) {
        this.nrConexiuniActive = nrConexiuniActive;
    }

    public void setStatusConexiune(String statusConexiune) {
        this.statusConexiune = statusConexiune;
    }
}
