package observer.stbF11.clase;

public interface IAutobuz {
    void adaugaCalator(ICalator calator);
    void dezabonareCalator(ICalator calator);
    void notificaCalatori(String mesaj);
}
