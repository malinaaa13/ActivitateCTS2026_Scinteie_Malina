package observer.spitalA12.clase;

public interface ISpital {
    void adaugaPacient(Pacient pacient);
    void stergePacient(Pacient pacient);
    void notificaPacient(String mesaj);
}
