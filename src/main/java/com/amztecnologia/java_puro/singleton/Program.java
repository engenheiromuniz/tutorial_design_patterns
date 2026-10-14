package com.amztecnologia.java_puro.singleton;

public class Program {

    public static void main(String[] args) {

        System.out.println("- - - - - Testando a Versão LAZY - - - - -");

        ContadorAcessos cont1 = ContadorAcessos.getInstance();
        ContadorAcessos cont2 = ContadorAcessos.getInstance();

        System.out.println("Acessos, cont1"+cont1.getTotal());
        System.out.println("Acessos, cont2"+cont2.getTotal());

        System.out.println("cont1 e cont2 ocupam o mesmo espaço de memória? "+(cont1 == cont2));

        cont1.registrar();
        cont1.registrar();

        System.out.println("Acesso via cont1: "+cont1.getTotal());
        System.out.println("Acesso via cont2: "+cont2.getTotal());

        System.out.println("\n\n- - - - - Testando a Versão EAGER - - - - -");
        ConfigApp sg1 = ConfigApp.getInstance();
        ConfigApp sg2 = ConfigApp.getInstance();

        System.out.println("Memória variável sg1: "+sg1);
        System.out.println("Memória variável sg2: "+sg2);

        System.out.println("Ocupam o mesmo espaço de memória: "+(sg1 == sg2));
        System.out.println(sg1.getNomeApp());
        System.out.println(sg2.getNomeApp());
    }
}
