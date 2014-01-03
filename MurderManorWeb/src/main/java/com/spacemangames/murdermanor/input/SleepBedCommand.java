package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class SleepBedCommand extends Command {
    public SleepBedCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.sleepBed();
    }

    @Override
    public String execute() {
        return replyStrings.sleepBed();
    }
}
