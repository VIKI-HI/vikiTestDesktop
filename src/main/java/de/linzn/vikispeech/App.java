package de.linzn.vikispeech;


import de.linzn.vikispeech.network.NetworkModule;
import de.linzn.vikispeech.network.readIn.TerminalTask;


public class App {

    public static App appInstance;

    public NetworkModule network;

    public App() {
        appInstance = this;
        this.network = new NetworkModule(appInstance);
        new TerminalTask();
    }

    public static void main(String[] args) {
        new App();
    }

    public static void logger(String msg) {
        System.out.println("Viki: " + msg);
    }


}