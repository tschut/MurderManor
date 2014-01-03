package com.spacemangames.murdermanor.input;

import java.util.HashSet;
import java.util.Set;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class GetUpCommand extends Command {
    public GetUpCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public Set<String> commandStrings() {
        HashSet<String> commandStringSet = new HashSet<String>();
        for (String string : commandStrings.getUp()) {
            commandStringSet.add(string);
        }
        return commandStringSet;
    }

    @Override
    public void execute() {
        roomManager.moveTo(RoomManager.Room.GUESTROOMI);
    }
}
