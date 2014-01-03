package com.spacemangames.murdermanor.input;

import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import com.spacemangames.murdermanor.client.CommandStrings;
import com.spacemangames.murdermanor.client.RoomManager;

public abstract class Command {
    protected static CommandStrings commandStrings = GWT.create(CommandStrings.class);
    protected RoomManager           roomManager;
    protected HTML                  feedbackPanel;

    public Command(RoomManager roomManager, HTML feedbackPanel) {
        this.roomManager = roomManager;
        this.feedbackPanel = feedbackPanel;
    }

    public abstract Set<String> commandStrings();

    public abstract void execute();
}
