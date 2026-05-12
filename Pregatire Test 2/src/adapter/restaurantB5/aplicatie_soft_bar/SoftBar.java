package adapter.restaurantB5.aplicatie_soft_bar;

public class SoftBar {
    private double total;
    private String bautura;

    public SoftBar(double total, String bautura) {
        this.total = total;
        this.bautura = bautura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SoftBar{");
        sb.append("total=").append(total);
        sb.append(", bautura='").append(bautura).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
