package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class SitChairCommand extends Command {
    public SitChairCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.sitChair();
    }

    @Override
    public String execute() {
        return replyStrings.sitChair();
    }
}
