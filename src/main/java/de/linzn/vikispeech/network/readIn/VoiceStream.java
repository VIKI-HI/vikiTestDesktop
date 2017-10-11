package de.linzn.vikispeech.network.readIn;


import de.linzn.jSocket.core.IncomingDataListener;
import de.linzn.vikiSpeechApi.VikiSpeechAPI;
import de.linzn.vikispeech.App;

import java.util.UUID;

public class VoiceStream implements IncomingDataListener {

    private App app;

    public VoiceStream(App app) {
        this.app = app;
    }


    @Override
    public void onEvent(String channel, UUID uuid, byte[] bytes) {
        VikiSpeechAPI.playVoiceStream(bytes);


    }

}
