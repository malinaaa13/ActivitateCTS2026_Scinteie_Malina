package singleton.static_block.main;

import singleton.static_block.clase.SystemConfig;

public class Main {
    public static void main(String[] args) {
        SystemConfig systemConfig = SystemConfig.getInstance();
        System.out.println(systemConfig);

        SystemConfig systemConfig1= SystemConfig.getInstance();
        systemConfig1.setVersiuneProtocol("TCP");

        System.out.println(systemConfig);
    }
}
