package subiecte.service2.prototype.clase;

public class Sticker implements ISticker {
    private String culoare;
    private Masina masina;

    private Sticker(){}

    public Sticker(Masina masina, String culoare){
        this.masina = masina;
        this.culoare = culoare;
    }


    @Override
    public ISticker copieaza() {
        Sticker sticker = new Sticker();
        sticker.culoare = this.culoare;
        if(this.masina != null){
            sticker.masina = new Masina(this.masina);
        }
        return sticker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("culoare='").append(culoare).append('\'');
        sb.append(", masina=").append(masina.getModel()).append(" ").append(masina.getAnFabricatie());
        sb.append('}');
        return sb.toString();
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }
}
