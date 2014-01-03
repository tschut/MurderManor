package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;
import com.spacemangames.murdermanor.client.RoomManager.Room;

public class GetUpCommand extends Command {
    public GetUpCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.getUp();
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
