package singleton.eager.main;

import singleton.eager.clase.AgentieEager;

public class Main {
    public static void main(String[] args) {
        AgentieEager agentie = AgentieEager.getInstanta("AgeTur", 2000, 7);
        AgentieEager agentie2 = AgentieEager.getInstanta("TravelAround", 3000, 8);

        agentie2.setNumeAgentie("TravelExpert");
        System.out.println(agentie.toString());
        System.out.println(agentie2.toString());

        if(agentie == agentie2) {
            System.out.println("Instanta unica");
        }
    }
}
