package adapter.restaurantB5.aplicatie_soft_facturi;

import adapter.restaurantB5.aplicatie_soft_bar.SoftBar;

public class AdapterSoftBar extends SoftFacturi {
    private SoftBar softBar;

    public AdapterSoftBar(int nrProduse, SoftBar softBar) {
        super(nrProduse);
        this.softBar = softBar;
    }


    @Override
    public void printeazaFactura() {
        System.out.println(softBar.toString());
    }
}
