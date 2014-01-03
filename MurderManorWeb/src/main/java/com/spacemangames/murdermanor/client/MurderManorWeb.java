package com.spacemangames.murdermanor.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class MurderManorWeb implements EntryPoint {
    @Override
    public void onModuleLoad() {
        RootPanel.get("mainui").add(new MainUI());
    }
}
