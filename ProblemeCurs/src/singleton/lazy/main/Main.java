package singleton.lazy.main;

import singleton.lazy.clase.AgentieLazy;

public class Main {
    public static void main(String[] args) {
        AgentieLazy agentie1 = AgentieLazy.getInstance("TurAge", 20007, 10);
        AgentieLazy agentie2 = AgentieLazy.getInstance("DiscoverTheWord", 40000, 123);
        agentie2.setNumeAgentie("Discover");


        System.out.println(agentie1);
        System.out.println(agentie2);
    }

}
