package singleton.static_block.main;

import singleton.static_block.clase.AgentieStaticBlock;

public class Main {
    public static void main(String[] args) {
        AgentieStaticBlock agentie1 = AgentieStaticBlock.getInstance();
        AgentieStaticBlock agentie2 = AgentieStaticBlock.getInstance();
        agentie2.setNumeAgentie("TravelAround");

        System.out.println(agentie1);
        System.out.println(agentie2);
    }
}
