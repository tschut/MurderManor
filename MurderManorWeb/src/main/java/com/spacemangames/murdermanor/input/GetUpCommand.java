package com.spacemangames.murdermanor.input;

import java.util.HashSet;
import java.util.Set;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;
import com.spacemangames.murdermanor.client.RoomManager.Room;

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
    public String execute() {
        if (roomManager.getCurrentRoom().equals(Room.BED)) {
            roomManager.moveTo(RoomManager.Room.GUESTROOMI);
            return replyStrings.ok();
        } else {
            return replyStrings.getUpInWrongRoom();
        }
    }
}
