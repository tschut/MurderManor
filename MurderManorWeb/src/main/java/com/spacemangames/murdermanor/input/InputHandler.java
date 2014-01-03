package com.spacemangames.murdermanor.input;

import java.util.HashSet;
import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.ReplyStrings;
import com.spacemangames.murdermanor.client.RoomManager;

public class InputHandler {
    private static ReplyStrings replyStrings = GWT.create(ReplyStrings.class);

    Set<Command>                commands     = new HashSet<Command>();

    private HTML                feedbackPanel;

    public InputHandler(RoomManager roomManager, HTML feedbackPanel) {
        this.feedbackPanel = feedbackPanel;
        commands.add(new GetUpCommand(roomManager, feedbackPanel));
    }

    public void handle(String input) {
        Command command = findCommand(input);

        if (command != null) {
            command.execute();
        } else {
            feedbackPanel.setHTML(replyStrings.unknownCommand());
        }
    }

    private Command findCommand(String input) {
        for (Command command : commands) {
            if (command.commandStrings().contains(input)) {
                return command;
            }
        }
        return null;
    }
}
