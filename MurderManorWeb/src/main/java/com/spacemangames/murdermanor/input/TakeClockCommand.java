package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class TakeClockCommand extends Command {
    public TakeClockCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.takeClock();
    }

    @Override
    public String execute() {
        return replyStrings.takeClock();
    }
}
