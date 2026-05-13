package command.restaurantB15.clase;


public class RezervareMasa implements Command {
    private Masa masa;

    public RezervareMasa(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.rezerva();
    }
}
