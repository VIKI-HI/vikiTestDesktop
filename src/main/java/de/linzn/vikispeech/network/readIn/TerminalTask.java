package de.linzn.vikispeech.network.readIn;


import de.linzn.vikispeech.network.writeOut.SendTerminal;

import java.io.Console;

public class TerminalTask {

    public TerminalTask() {
        while (true) {
            Console console = System.console();
            String input = console.readLine("#: ");
            new SendTerminal(input);
        }

    }
}
