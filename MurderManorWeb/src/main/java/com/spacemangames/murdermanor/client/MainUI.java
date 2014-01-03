package com.spacemangames.murdermanor.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MainUI extends Composite {
    private static MainUIUiBinder uiBinder = GWT.create(MainUIUiBinder.class);

    interface MainUIUiBinder extends UiBinder<Widget, MainUI> {
    }

    public MainUI() {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
