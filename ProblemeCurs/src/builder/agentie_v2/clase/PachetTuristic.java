package builder.agentie_v2.clase;

public class PachetTuristic {
    protected boolean areWifi;
    protected boolean areAnimale;
    protected boolean isFumator;
    protected boolean areAC;
    protected boolean areTV;

    public PachetTuristic(boolean areWifi, boolean areAnimale, boolean isFumator, boolean areAC, boolean areTV) {
        this.areWifi = areWifi;
        this.areAnimale = areAnimale;
        this.isFumator = isFumator;
        this.areAC = areAC;
        this.areTV = areTV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("areWifi=").append(areWifi);
        sb.append(", areAnimale=").append(areAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append(", areAC=").append(areAC);
        sb.append(", areTV=").append(areTV);
        sb.append('}');
        return sb.toString();
    }
}
