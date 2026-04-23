package subiecte.service2.prototype.main;

import subiecte.service2.prototype.clase.ISticker;
import subiecte.service2.prototype.clase.Masina;
import subiecte.service2.prototype.clase.Sticker;

public class Main {
    public static void main(String[] args) {
        Masina masina1 = new Masina("A1", 2020);
        Masina masina2 = new Masina("A2", 2021);

        ISticker sticker1 = new Sticker(masina1,"rosu");
        ISticker sticker1Cllona = sticker1.copieaza();
        sticker1Cllona.setCuloare("negru");

        ISticker sticker2 = new Sticker(masina2, "alb");
        ISticker sticker2Clona = sticker2.copieaza();
        sticker2Clona.setCuloare("verde");


        System.out.println(sticker1);
        System.out.println(sticker2);
        System.out.println(sticker1Cllona);
        System.out.println(sticker2Clona);
    };

}
