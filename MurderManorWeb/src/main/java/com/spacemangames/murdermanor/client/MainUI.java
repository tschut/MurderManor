package com.spacemangames.murdermanor.client;

import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.TextBox;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.spacemangames.murdermanor.input.InputHandler;

public class MainUI extends Composite {
    private static MainUIUiBinder uiBinder = GWT.create(MainUIUiBinder.class);

    interface MainUIUiBinder extends UiBinder<Widget, MainUI> {
    }

    private InputHandler inputHandler;
    private RoomManager  roomManager;

    @UiField
    protected HTML       storyPanel;

    @UiField
    protected HTML       feedbackPanelLastCommand;

    @UiField
    protected HTML       feedbackPanel;

    @UiField
    protected TextBox    inputTextBox;

    @UiField
    protected Button     submitButton;

    public MainUI() {
        initWidget(uiBinder.createAndBindUi(this));

        roomManager = new RoomManager(storyPanel);
        inputHandler = new InputHandler(roomManager, feedbackPanelLastCommand, feedbackPanel);

        storyPanel.setHTML(roomManager.getCurrentRoom().getDescription());
    }

    @UiHandler(value = "submitButton")
    protected void onSubmitButtonClicked(ClickEvent event) {
        handleInput(inputTextBox.getText());
    }

    @UiHandler(value = "inputTextBox")
    protected void onEnterInInputTextBox(KeyPressEvent event) {
        if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_ENTER) {
            handleInput(inputTextBox.getText());
        }
    }

    private void handleInput(String text) {
        inputHandler.handle(text);
        inputTextBox.setText(null);
    }
}
