package singleton.threadsafe.main;

import singleton.threadsafe.clase.AgentieThreadSafe;

public class Main {
    public static void main(String[] args) {
        AgentieThreadSafe agentie1 = AgentieThreadSafe.getInstance("AgeTur", 2900, 6);
        AgentieThreadSafe agentie2 = AgentieThreadSafe.getInstance("Travel", 6000, 12);

        System.out.println(agentie1);
        System.out.println(agentie2);
    }
}
