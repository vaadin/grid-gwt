package org.vaadin.artur.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwtgrid1 implements EntryPoint {
    @Override
    public void onModuleLoad() {
        RootPanel.get("grid").add(new MyGrid());

    }
}
