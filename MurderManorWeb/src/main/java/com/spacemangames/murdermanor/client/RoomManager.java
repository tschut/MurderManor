package com.spacemangames.murdermanor.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;

public class RoomManager {
    protected static DescriptionStrings descriptionStrings = GWT.create(DescriptionStrings.class);

    public static enum Room {
        BED("bed"),
        GUESTROOMI("guestroomI");

        private String id;

        private Room(String id) {
            this.id = id;
        }

        public String getDescription() {
            return descriptionStrings.rooms().get(getId());
        }

        private String getId() {
            return id;
        }
    }

    private Room currentRoom = Room.BED;
    private HTML storyPanel;

    public RoomManager(HTML storyPanel) {
        this.storyPanel = storyPanel;
    }

    public void moveTo(Room newRoom) {
        currentRoom = newRoom;
        storyPanel.setHTML(currentRoom.getDescription());
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}
