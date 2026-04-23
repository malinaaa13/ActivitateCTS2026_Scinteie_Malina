package subiecte.service2.prototype.clase;

public class Masina implements IMasina {
    private String model;
    private int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getAnFabricatie() {
        return this.anFabricatie;
    }

    public Masina(Masina m) {
        this.model = m.model;
        this.anFabricatie = m.anFabricatie;
    }


}
