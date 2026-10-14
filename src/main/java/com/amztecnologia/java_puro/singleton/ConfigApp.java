package com.amztecnologia.java_puro.singleton;

public class ConfigApp {

    private static final ConfigApp INSTANCE = new ConfigApp();
    private final String nomeApp = "AndreMUNIZ - App";

    private ConfigApp(){ }

    public static ConfigApp getInstance(){
        return INSTANCE;
    }


    public String getNomeApp(){
        return nomeApp;
    }
}
