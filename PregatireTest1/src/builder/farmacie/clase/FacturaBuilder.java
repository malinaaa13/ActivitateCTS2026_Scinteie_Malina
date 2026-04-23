package builder.farmacie.clase;

public class FacturaBuilder implements IBuilder{
    private int nrPungi;
    private boolean dorestePungi;
    private boolean platesteCuCard;
    private boolean platesteCash;
    private boolean areCardFidelitate;
    private int cotaTVA;
    private boolean platitorTVA;

    public FacturaBuilder(){
        this.nrPungi=0;
        this.dorestePungi=false;
        this.platesteCuCard = true;
        this.platesteCash = false;
        this.areCardFidelitate = false;
        this.cotaTVA = 0;
        this.platitorTVA = false;

    }

    public FacturaBuilder setNrPungi(int nrPungi){
        this.nrPungi = nrPungi;
        return this;
    }

    public FacturaBuilder setPlataCard(boolean platesteCuCard){
        this.platesteCuCard = platesteCuCard;
        return this;
    }

    public FacturaBuilder setPlatesteCash(boolean platesteCash){
        this.platesteCash = platesteCash;
        return this;
    }

    public FacturaBuilder setAreCardFidelitate(boolean areCardFidelitate){
        this.areCardFidelitate = areCardFidelitate;
        return this;
    }

    public FacturaBuilder setCotaTVA(int cotaTVA){
        this.cotaTVA = cotaTVA;
        return this;
    }

    public FacturaBuilder setPlatitorTVA(boolean platitorTVA){
        this.platitorTVA = platitorTVA;
        return this;
    }

    @Override
    public Factura build() {
        return new Factura(this.nrPungi, this.dorestePungi, this.platesteCuCard, this.platesteCash, this.areCardFidelitate, this.cotaTVA, this.platitorTVA);
    }
}
