package de.linzn.vikispeech.network;


import de.linzn.jSocket.client.JClientConnection;
import de.linzn.vikispeech.App;
import de.linzn.vikispeech.network.readIn.ConnectionStream;
import de.linzn.vikispeech.network.readIn.TerminalStream;
import de.linzn.vikispeech.network.readIn.VoiceStream;
import de.linzn.vikispeech.network.template.Channel;

public class NetworkModule {

    public JClientConnection jClientConnection;
    private App app;

    public NetworkModule(App app) {
        App.logger(this.getClass().getSimpleName() + "->" + "creating Instance ");
        this.app = app;
        this.jClientConnection = new JClientConnection("viki.lan", 11102);
        this.registerEvents();
        this.createNetwork();
    }

    private void registerEvents() {
        this.jClientConnection.registerIncomingDataListener(Channel.voiceChannel, new VoiceStream(this.app));
        this.jClientConnection.registerIncomingDataListener(Channel.terminalChannel, new TerminalStream(this.app));
        this.jClientConnection.registerConnectionListener(new ConnectionStream(this.app));
    }

    public void createNetwork() {
        this.jClientConnection.setEnable();
    }

    public void deleteNetwork() {
        this.jClientConnection.setDisable();
    }

}
