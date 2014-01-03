package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class TakeCoatHangerCommand extends Command {
    public TakeCoatHangerCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.takeCoathanger();
    }

    @Override
    public String execute() {
        return replyStrings.takeCoatHanger();
    }
}
