package singleton.eager.clase;

public class PrintManager {
    private String numeImprimanta;
    private int documenteCoada;
    private boolean esteColor;

    private static final PrintManager instanta = new PrintManager();

    private PrintManager() {
        this.numeImprimanta = "HP";
        this.documenteCoada = 3;
        this.esteColor = true;
    }

    public static PrintManager getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PrintManager{");
        sb.append("numeImprimanta='").append(numeImprimanta).append('\'');
        sb.append(", documenteCoada=").append(documenteCoada);
        sb.append(", esteColor=").append(esteColor);
        sb.append('}');
        return sb.toString();
    }

    public void setNumeImprimanta(String numeImprimanta) {
        this.numeImprimanta = numeImprimanta;
    }

    public void setDocumenteCoada(int documenteCoada) {
        this.documenteCoada = documenteCoada;
    }

    public void setEsteColor(boolean esteColor) {
        this.esteColor = esteColor;
    }
}
