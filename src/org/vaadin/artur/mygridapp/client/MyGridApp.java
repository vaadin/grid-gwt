package org.vaadin.artur.mygridapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class MyGridApp implements EntryPoint {
    @Override
    public void onModuleLoad() {
        RootPanel.get("grid").add(new MyGrid());
    }
}
