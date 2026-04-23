package builder.agentie_v2.clase;

import builder.agentie_v2.clase.PachetTuristic;

public class Builder implements IBuilder{
    protected boolean areWifi;
    protected boolean areAnimale;
    protected boolean isFumator;
    protected boolean areAC;
    protected boolean areTV;

    public Builder() {
        this.areWifi = false;
        this.areAnimale = false;
        this.isFumator = false;
        this.areAC = false;
        this.areTV = false;
    }

    public Builder setAreWifi (boolean areWifi){
        this.areWifi = areWifi;
        return this;
    }

    public Builder setAreAnimale(boolean areAnimale) {
        this.areAnimale = areAnimale;
        return this;
    }

    public Builder setFumator(boolean fumator) {
        isFumator = fumator;
        return this;
    }

    public Builder setAreAC(boolean areAC) {
        this.areAC = areAC;
        return this;
    }

    public Builder setAreTV(boolean areTV) {
        this.areTV = areTV;
        return this;
    }

    @Override
    public PachetTuristic build() {
        return new PachetTuristic(this.areWifi, this.areAnimale, this.isFumator,
                this.areAC, this.areTV);
    }
}
