package org.vaadin.artur.gridgwt.client;

import java.util.ArrayList;

import com.vaadin.client.widget.grid.datasources.ListDataSource;
import com.vaadin.client.widgets.Grid;

public class MyGrid extends Grid<Person> {
    public MyGrid() {
        super();
        setSelectionMode(SelectionMode.SINGLE);
        addColumn(new Column<String, Person>("Name") {
            @Override
            public String getValue(Person row) {
                return row.getName();
            }
        });

        // A simple String column for the add-on summary/description
        addColumn(new Column<Integer, Person>("Age") {
            @Override
            public Integer getValue(Person row) {
                return row.getAge();
            }
        });

        // Some dummy data
        ArrayList<Person> addons = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            addons.add(new Person("John", 12));
            addons.add(new Person("Emma", 18));
            addons.add(new Person("Jeff", 44));
            addons.add(new Person("George", 78));
            addons.add(new Person("Abraham", 114));
            addons.add(new Person("Henrik", 32));
            addons.add(new Person("Paul", 56));
            addons.add(new Person("Biff", 34));
            addons.add(new Person("Leo", 88));
        }
        setDataSource(new ListDataSource<Person>(addons));
    }
}
