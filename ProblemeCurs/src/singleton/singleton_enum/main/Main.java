package singleton.singleton_enum.main;


import singleton.singleton_enum.clase.AgetieEnum;

public class Main {
    public static void main(String[] args) {
        AgetieEnum agentie = AgetieEnum.instanta;

        System.out.println(agentie.getNumeAgentie());

        agentie.setNumeAgentie("Travel Expert");
        AgetieEnum agentie2 = AgetieEnum.instanta;
        System.out.println(agentie2.getNumeAgentie());
        System.out.println(agentie.getNumeAgentie());
    }
}
