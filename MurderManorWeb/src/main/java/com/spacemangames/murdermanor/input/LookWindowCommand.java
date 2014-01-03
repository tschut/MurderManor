package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class LookWindowCommand extends Command {
    public LookWindowCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.lookWindow();
    }

    @Override
    public String execute() {
        return replyStrings.whichWindow();
    }
}
