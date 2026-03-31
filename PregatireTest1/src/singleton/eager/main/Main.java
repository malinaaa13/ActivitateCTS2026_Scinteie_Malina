package singleton.eager.main;

import singleton.eager.clase.PrintManager;

public class Main {
    public static void main(String[] args) {
        PrintManager imprimanta1 = PrintManager.getInstanta();
        imprimanta1.setNumeImprimanta("Lenovo");
        System.out.println(imprimanta1);

        PrintManager imprimanta2 = PrintManager.getInstanta();
        imprimanta2.setDocumenteCoada(4);
        System.out.println(imprimanta2);
        System.out.println(imprimanta1);

        if(imprimanta1 == imprimanta2) {
            System.out.println("Instanta este unica");
        }
    }
}
