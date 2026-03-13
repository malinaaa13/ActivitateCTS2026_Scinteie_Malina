package ro.ase.cts.singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;

    private static Logger instantaSingleton = null;

    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public static synchronized Logger getInstanta(String sender, String categorie){
        if(instantaSingleton == null){
            instantaSingleton = new Logger(sender, categorie);
        }
        return instantaSingleton;
    }

    public void afiseazaLog(String text){
        //putea fi realizat cu StringBuilder
        System.out.println("Log ul cu ID "+ cod +", efectuat de utilizatorul "+ sender+ " a constat in " +text + " din categoria "+ categorie);
        this.cod++;
    }
}
