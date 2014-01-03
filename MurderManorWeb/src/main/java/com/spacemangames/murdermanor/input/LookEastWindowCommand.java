package com.spacemangames.murdermanor.input;

import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.RoomManager;

public class LookEastWindowCommand extends Command {
    public LookEastWindowCommand(RoomManager roomManager, HTML feedbackPanel) {
        super(roomManager, feedbackPanel);
    }

    @Override
    public String[] commandStringArray() {
        return commandStrings.lookEastWindow();
    }

    @Override
    public String execute() {
        return replyStrings.eastWindow();
    }
}
