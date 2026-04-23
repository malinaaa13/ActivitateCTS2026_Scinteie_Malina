package singleton.thread_safe.main;

import singleton.thread_safe.clase.Logger;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Logger log1 = Logger.getInstance("fisier.txt");
                System.out.println(log1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Logger log2 = Logger.getInstance("date.txt");
                log2.setNumeFisier("date_actualizate.txt");
                System.out.println(log2);
            }
        });

        thread1.start();
        thread2.start();
    }
}
