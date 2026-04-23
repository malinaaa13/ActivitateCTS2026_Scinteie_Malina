package builder.agentie_v1.clase;

public class PachetBuilder implements IBuilder{
    private PachetTransport pachetTransport;

    public PachetBuilder(PachetTransport pachetTransport) {
        this.pachetTransport = new PachetTransport(false, false, false, false, false);
    }

    public PachetBuilder setAreWifi(boolean areWifi){
        this.pachetTransport.areWifi = areWifi;
        return this;
    }

    public PachetBuilder setAreAnimale (boolean areAnimale){
        this.pachetTransport.areAnimale = areAnimale;
        return this;
    }

    public PachetBuilder setFumator(boolean isFumator){
        this.pachetTransport.isFumator = isFumator;
        return this;
    }

    public PachetBuilder setAreAC(boolean areAC){
        this.pachetTransport.areAC = areAC;
        return this;
    }

    public PachetBuilder setAreTV(boolean areTV){
        this.pachetTransport.areTV = areTV;
        return this;
    }

    @Override
    public PachetTransport build() {
        return this.pachetTransport;
    }


}
