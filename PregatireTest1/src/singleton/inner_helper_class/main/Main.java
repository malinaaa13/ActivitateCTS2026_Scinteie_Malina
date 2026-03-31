package singleton.inner_helper_class.main;

import singleton.inner_helper_class.clase.LogManager;

public class Main {
    public static void main(String[] args) {
        LogManager log1 = LogManager.getInstance();

        log1.adaugaEroare("conexiune la baza de date esuata");
        log1.adaugaEroare("syntax error");
        log1.adaugaEroare("imcompatible types");

        LogManager log2 = LogManager.getInstance();

        System.out.println(log1.toString());
        System.out.println(log2);
    }
}
