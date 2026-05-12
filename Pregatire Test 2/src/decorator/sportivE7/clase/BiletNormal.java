package decorator.sportivE7.clase;

public class BiletNormal implements InterfataBilet{
    private int rand;
    private int loc;

    public BiletNormal(int rand, int loc) {
        this.rand = rand;
        this.loc = loc;
    }

    @Override
    public void printeaza() {
        System.out.println("Ati rezervat un bilet pe randul "+this.rand+" , locul "+this.loc);

    }

}
