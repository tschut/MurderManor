package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class LookWardrobeCommand extends Command {
    public LookWardrobeCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.lookWardrobe();
    }

    @Override
    public String execute() {
        return replyStrings.wardrobe();
    }
}
