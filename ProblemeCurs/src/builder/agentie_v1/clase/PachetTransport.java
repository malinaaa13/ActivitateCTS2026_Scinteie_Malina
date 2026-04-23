package builder.agentie_v1.clase;

public class PachetTransport {
    protected boolean areWifi;
    protected boolean areAnimale;
    protected boolean isFumator;
    protected boolean areAC;
    protected boolean areTV;

    public PachetTransport(boolean areWifi, boolean areAnimale, boolean isFumator, boolean areAC, boolean areTV) {
        this.areWifi = areWifi;
        this.areAnimale = areAnimale;
        this.isFumator = isFumator;
        this.areAC = areAC;
        this.areTV = areTV;
    }

    public PachetTransport() {}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("areWifi=").append(areWifi);
        sb.append(", areAnimale=").append(areAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append(", areAC=").append(areAC);
        sb.append(", areTV=").append(areTV);
        sb.append('}');
        return sb.toString();
    }
}
