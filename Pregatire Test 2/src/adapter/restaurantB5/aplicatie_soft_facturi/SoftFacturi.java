package adapter.restaurantB5.aplicatie_soft_facturi;

public class SoftFacturi {
    private int nrProduse;

    public SoftFacturi(int nrProduse) {

        this.nrProduse = nrProduse;
    }

    public void printeazaFactura()
    {
        System.out.println("Factura contine: "+this.nrProduse+" produse");
    }
}
