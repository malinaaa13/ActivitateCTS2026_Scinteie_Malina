package singleton.eager.registru_configurari.main;

import singleton.eager.registru_configurari.clase.SystemConfig;

public class Main {
    public static void main(String[] args) {
        SystemConfig systemConfig = SystemConfig.getInstance();
        System.out.println(systemConfig);

        SystemConfig systemConfig2 = SystemConfig.getInstance();
        systemConfig.setPort(5768);
        System.out.println(systemConfig2);

    }
}
