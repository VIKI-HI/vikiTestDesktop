package de.linzn.vikispeech.network.writeOut;

import de.linzn.vikispeech.App;
import de.linzn.vikispeech.network.template.Channel;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class SendTerminal {

    public SendTerminal(String input) {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(byteOut);
        try {
            out.writeUTF(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        App.appInstance.network.jClientConnection.writeOutput(Channel.terminalChannel, byteOut.toByteArray());

    }
}
