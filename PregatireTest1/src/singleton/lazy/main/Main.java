package singleton.lazy.main;

import singleton.lazy.clase.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aplicatia a pornit. Conexiune nu a fost inca stabilita");

        DatabaseConnection databaseConnection = DatabaseConnection.getInstance("clienti", 4, "esuata");
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance("carti", 3, "activa");
        databaseConnection1.setDenumireBazaDate("Books");

        System.out.println(databaseConnection);
        System.out.println(databaseConnection1);

    }
}
