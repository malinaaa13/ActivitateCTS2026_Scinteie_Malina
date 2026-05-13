package command.restaurantB15.clase;


public class OcupareMasa implements Command {
    private Masa masa;

    public OcupareMasa(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.ocupa();
    }
}
