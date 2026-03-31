package singleton.inner_helper_class.clase;

public class LogManager {
    private String denumireFisierLog;
    private int nrEroriInregistrate;

    private static class LogHelper {
        private static final LogManager instanta = new LogManager();
    }

    private LogManager() {
        this.denumireFisierLog = "app_errors.log";
        this.nrEroriInregistrate = 0;
    }

    public static LogManager getInstance() {
        return LogHelper.instanta;
    }

    public void adaugaEroare(String mesaj) {
        this.nrEroriInregistrate++;
        System.out.println("Log scris in "+ this.denumireFisierLog +": "+mesaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LogManager{");
        sb.append("denumireFisierLog='").append(denumireFisierLog).append('\'');
        sb.append(", nrEroriInregistrate=").append(nrEroriInregistrate);
        sb.append('}');
        return sb.toString();
    }
}
