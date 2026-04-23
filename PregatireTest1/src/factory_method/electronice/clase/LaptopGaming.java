package factory_method.electronice.clase;

public class LaptopGaming extends Laptop{
    public LaptopGaming(double dimensiuneDisplay, String culoare, int memorieRAM) {
        super(dimensiuneDisplay, culoare, memorieRAM);
    }

    @Override
    public void afiseaza() {
        System.out.println("Laptopul are display-ul de "+super.dimensiuneDisplay+
                ", culoare "+super.culoare+" are "+super.memorieRAM+" memorie RAM si este un laptop de gaming");
    }
}
