package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class LookClockCommand extends Command {
    public LookClockCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.lookClock();
    }

    @Override
    public String execute() {
        return replyStrings.lookClock();
    }
}
