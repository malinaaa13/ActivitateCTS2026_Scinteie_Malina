package subiecte.service1.singleton;

public class Service implements IService{
    private AMasina masina;
    private String adresa;

    private static Service instanta = null;

    private Service(){
        this.masina = null;
        this.adresa = "-";
    }

    public static Service getInstance(){
        if(instanta == null){
            instanta = new Service();
        }
        return instanta;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Service{");
        sb.append("masina=").append(masina);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void primesteMasina(AMasina masina) {
        if(this.masina == null){
            this.masina =  masina;
            System.out.println("Masina "+masina.toString() +" a intrat in service");
            masina.seRepera();
        } else {
            System.out.println("Service ocupat! Asteptati sa se elibereze");
        }

    }

    @Override
    public void elibereazaService() {
        if(this.masina != null){
            this.masina = null;
            System.out.println("Service eliberat");
        }
    }
}
