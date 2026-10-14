package com.amztecnologia.java_puro.singleton;

public class ContadorAcessos {

    private static volatile ContadorAcessos instance;
    private int total;

    private ContadorAcessos(){ }

    public static ContadorAcessos getInstance(){
        if(instance == null){
            synchronized (ContadorAcessos.class){
                if(instance == null){
                    instance = new ContadorAcessos();
                }
            }
        }
        return instance;
    }

    public synchronized  void registrar(){
        total++;
    }

    public synchronized int getTotal(){
        return  total;
    }
}
