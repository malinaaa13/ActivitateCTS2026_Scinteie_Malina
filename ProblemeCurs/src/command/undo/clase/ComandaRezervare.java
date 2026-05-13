package command.undo.clase;

public class ComandaRezervare implements Command{

    private PachetTuristic pachet;

    public ComandaRezervare(PachetTuristic pachet) {
        this.pachet = pachet;
    }

    @Override
    public void executa() {
        pachet.rezerva();
    }

    @Override
    public void unexecuta() {
        pachet.anulareRezervare();
    }
}
