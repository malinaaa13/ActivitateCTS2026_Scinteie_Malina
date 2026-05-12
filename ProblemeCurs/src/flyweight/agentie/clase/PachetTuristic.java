package flyweight.agentie.clase;

public class PachetTuristic implements IPachetTuristic{
    private int codPachet;
    private String hotel;
    private String destinatie;
    private boolean micDejun;

    public PachetTuristic(int codPachet, String hotel, String destinatie, boolean micDejun) {
        this.codPachet = codPachet;
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
    }

    public int getCodPachet() {
        return codPachet;
    }

    public String getHotel() {
        return hotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public void setCodPachet(int codPachet) {
        this.codPachet = codPachet;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("codPachet=").append(codPachet);
        sb.append(", hotel='").append(hotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", micDejun=").append(micDejun);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriePachet(Optionale optionale) {
        System.out.println("Pachetul Turistic cu codul "+codPachet
        + ", are cazare la hotelul "+hotel
        +", din orasul "+destinatie
        +(micDejun ? " are ":" nu are ")
        +"micdejun, "+(optionale.isCina() ? " are ":" nu are ")+
        "inclusa cina si are un numar de "+
                optionale.getNumarExcursii()+ " excursii optionale.");
    }

}
