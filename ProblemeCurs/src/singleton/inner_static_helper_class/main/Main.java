package singleton.inner_static_helper_class.main;

import singleton.inner_static_helper_class.clase.AgentieInnerClass;

public class Main {
    public static void main(String[] args) {
        AgentieInnerClass agentie1 = AgentieInnerClass.getInstance();
        AgentieInnerClass agentie2 = AgentieInnerClass.getInstance();

        agentie2.setNumeAgentie("Travel Expert");

        System.out.println(agentie1);
        System.out.println(agentie2);
    }
}
