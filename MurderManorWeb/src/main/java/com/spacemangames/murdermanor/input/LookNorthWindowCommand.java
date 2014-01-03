package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class LookNorthWindowCommand extends Command {
    public LookNorthWindowCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.lookNorthWindow();
    }

    @Override
    public String execute() {
        return replyStrings.northWindow();
    }
}
