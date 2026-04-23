package builder.farmacie.clase;

public class Factura {
    private int nrPungi;
    private boolean dorestePungi;
    private boolean platesteCuCard;
    private boolean platesteCash;
    private boolean areCardFidelitate;
    private int cotaTVA;
    private boolean platitorTVA;

    public Factura(int nrPungi, boolean dorestePungi, boolean platesteCuCard, boolean platesteCash, boolean areCardFidelitate, int cotaTVA, boolean platitorTVA) {
        this.nrPungi = nrPungi;
        this.dorestePungi = dorestePungi;
        this.platesteCuCard = platesteCuCard;
        this.platesteCash = platesteCash;
        this.areCardFidelitate = areCardFidelitate;
        this.cotaTVA = cotaTVA;
        this.platitorTVA = platitorTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("nrPungi=").append(nrPungi);
        sb.append(", dorestePungi=").append(dorestePungi);
        sb.append(", platesteCuCard=").append(platesteCuCard);
        sb.append(", platesteCash=").append(platesteCash);
        sb.append(", areCardFidelitate=").append(areCardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append(", platitorTVA=").append(platitorTVA);
        sb.append('}');
        return sb.toString();
    }
}
