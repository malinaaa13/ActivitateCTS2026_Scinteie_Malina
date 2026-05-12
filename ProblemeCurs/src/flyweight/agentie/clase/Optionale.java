package flyweight.agentie.clase;

public class Optionale {
    private boolean cina;
    private int numarExcursii;

    public Optionale(int numarExcursii, boolean cina) {
        this.numarExcursii = numarExcursii;
        this.cina = cina;
    }

    public boolean isCina() {
        return cina;
    }

    public int getNumarExcursii() {
        return numarExcursii;
    }

    public void setCina(boolean cina) {
        this.cina = cina;
    }

    public void setNumarExcursii(int numarExcursii) {
        this.numarExcursii = numarExcursii;
    }
}
