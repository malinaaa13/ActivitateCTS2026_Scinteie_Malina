package command.undo.clase;

public class ComandaVanzare implements Command{
    private PachetTuristic pachet;

    public ComandaVanzare(PachetTuristic pachet) {
        this.pachet = pachet;
    }

    @Override
    public void executa() {
        pachet.vanzare();
    }

    @Override
    public void unexecuta() {
        pachet.anulareVanzare();
    }
}
