package adapter.adapterclase.inchirieremasini;

public class Masina {
    private String model;
    private double capitateCilindrica;

    public double getCapitateCilindrica() {
        return capitateCilindrica;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapitateCilindrica(double capitateCilindrica) {
        this.capitateCilindrica = capitateCilindrica;
    }

    public Masina(String model, double capitateCilindrica) {
        this.model = model;
        this.capitateCilindrica = capitateCilindrica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", capitateCilindrica=").append(capitateCilindrica);
        sb.append('}');
        return sb.toString();
    }
}
