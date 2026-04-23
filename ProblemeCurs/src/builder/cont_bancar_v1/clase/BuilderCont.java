package builder.cont_bancar_v1.clase;

public class BuilderCont implements IBuilder{
    private ContBancar cont;

    public BuilderCont() {
        this.cont = new ContBancar();
    }


    public BuilderCont setDestinatar(String destinatar){
        this.cont.setDestinatar(destinatar);
        return this;
    }

    public BuilderCont setSumaBlocata(double sumaBlocata){
        this.cont.setSumaBlocata(sumaBlocata);
        return this;
    }

    public BuilderCont setSuma(double suma){
        this.cont.setSuma(suma);
        return this;
    }

    public BuilderCont setMoneda(String moneda){
        this.cont.setMoneda(moneda);
        return this;
    }

    public BuilderCont setAreCardAtasat(boolean areCardAtasat){
        this.cont.setCardAtasat(areCardAtasat);
        return this;
    }

    public BuilderCont setAreInternetBanking(boolean areInternetBanking){
        this.cont.setInternetBanking(areInternetBanking);
        return this;
    }

    public BuilderCont setContSalariu(boolean contSalariu){
        this.cont.setContSalariu(contSalariu);
        return this;
    }

    @Override
    public ContBancar build() {
        return this.cont;
    }
}
