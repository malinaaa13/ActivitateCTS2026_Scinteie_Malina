package subiecte.service1.singleton;

public abstract class AMasina {
    private String marca;
    private String model;
    private String nrImatriculare;
    private int anFabricatie;

    public AMasina(String marca, String model, String nrImatriculare, int anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.nrImatriculare = nrImatriculare;
        this.anFabricatie = anFabricatie;
    }

    public abstract void seRepera();


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMasina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrImatriculare='").append(nrImatriculare).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }
}
