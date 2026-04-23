package prototype.clase;

public class ContBanca implements IContBanca{
    private String numeClient;
    private String cnp;
    private String nrCard;
    private int cvv;

    public ContBanca(String numeClient, String cnp, String nrCard, int cvv) {
        if(numeClient.length() > 3){
            this.numeClient = numeClient;
        } else{
            this.numeClient="Necunoscut";
        }
        if(cnp.length() == 13){
            this.cnp=cnp;
        } else{
            this.cnp="1234567890123";
        }
        if(nrCard.length() == 16 ){
            this.nrCard = nrCard;
        } else {
            this.nrCard = "1234567890123456";
        }
        if(cvv>=100 && cvv<=999) {
            this.cvv = cvv;
        } else {
            this.cvv = 123;
        }
    }

    public ContBanca() {};

    @Override
    public IContBanca copiaza() {
        ContBanca cont = new ContBanca();
        cont.nrCard = this.nrCard;
        cont.numeClient = this.numeClient;
        cont.cnp = this.cnp;
        cont.cvv = this.cvv;
        return cont;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBanca{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", cnp='").append(cnp).append('\'');
        sb.append(", nrCard='").append(nrCard).append('\'');
        sb.append(", cvv=").append(cvv);
        sb.append('}');
        return sb.toString();
    }
}
