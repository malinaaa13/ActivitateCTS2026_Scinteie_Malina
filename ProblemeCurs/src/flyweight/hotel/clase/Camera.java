package flyweight.hotel.clase;

public class Camera implements ICamera{

    private int codAranjare;
    private int nrProsoape;
    private int nrCearsafuri;
    private int nrPerne;
    private int nrUmerase;

    public Camera(int codAranjare, int nrProsoape, int nrCearsafuri, int nrPerne, int nrUmerase) {
        this.codAranjare = codAranjare;
        this.nrProsoape = nrProsoape;
        this.nrCearsafuri = nrCearsafuri;
        this.nrPerne = nrPerne;
        this.nrUmerase = nrUmerase;
    }

    @Override
    public void tiparire(Rezervare rezervare) {
        System.out.println(this.toString() + " " + rezervare.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camera{");
        sb.append("codAranjare=").append(codAranjare);
        sb.append(", nrProsoape=").append(nrProsoape);
        sb.append(", nrCearsafuri=").append(nrCearsafuri);
        sb.append(", nrPerne=").append(nrPerne);
        sb.append(", nrUmerase=").append(nrUmerase);
        sb.append('}');
        return sb.toString();
    }
}
