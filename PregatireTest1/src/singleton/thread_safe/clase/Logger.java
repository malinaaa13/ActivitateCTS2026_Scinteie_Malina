package singleton.thread_safe.clase;

public class Logger {
    private String numeFisier;

    private static Logger instanta = null;

    private Logger(String numeFisier){
        this.numeFisier = numeFisier;
    }

    public synchronized static Logger getInstance(String numeFisier){
        if(instanta == null){
            instanta = new Logger(numeFisier);
        }
        return instanta;
    }

    public void setNumeFisier(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Logger{");
        sb.append("numeFisier='").append(numeFisier).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
