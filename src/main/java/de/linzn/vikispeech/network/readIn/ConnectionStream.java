package de.linzn.vikispeech.network.readIn;


import de.linzn.jSocket.core.ConnectionListener;
import de.linzn.vikispeech.App;

import java.util.UUID;

public class ConnectionStream implements ConnectionListener {

    private App app;

    public ConnectionStream(App app) {
        this.app = app;
    }

    @Override
    public void onConnectEvent(UUID uuid) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onDisconnectEvent(UUID uuid) {

    }

}
