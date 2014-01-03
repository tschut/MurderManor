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

public class MainUI extends Composite {
    private static MainUIUiBinder  uiBinder        = GWT.create(MainUIUiBinder.class);
    private static StringConstants stringConstants = GWT.create(StringConstants.class);

    interface MainUIUiBinder extends UiBinder<Widget, MainUI> {
    }

    @UiField
    protected HTML    storyPanel;

    @UiField
    protected HTML    feedbackPanel;

    @UiField
    protected TextBox inputTextBox;

    @UiField
    protected Button  submitButton;

    public MainUI() {
        initWidget(uiBinder.createAndBindUi(this));

        storyPanel.setHTML(stringConstants.introText());
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
        feedbackPanel.setHTML(stringConstants.unknownCommand());
    }
}
