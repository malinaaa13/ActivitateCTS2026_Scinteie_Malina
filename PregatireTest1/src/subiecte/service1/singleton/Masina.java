package subiecte.service1.singleton;

public class Masina extends AMasina{
    private String posesor;

    public Masina(String marca, String model, String nrImatriculare, int anFabricatie, String posesor) {
        super(marca, model, nrImatriculare, anFabricatie);
        this.posesor = posesor;
    }

    @Override
    public void seRepera() {
        System.out.println("Se realizeaza repararea");
    }

    @Override
    public String toString() {
       return  super.toString() + " posesor="+this.posesor;

    }
}
