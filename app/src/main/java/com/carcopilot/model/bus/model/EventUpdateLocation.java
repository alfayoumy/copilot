package com.carcopilot.model.bus.model;

import com.carcopilot.model.bus.EventModel;
import com.carcopilot.model.entity.Data;

public class EventUpdateLocation implements EventModel {

    private Data data;

    public EventUpdateLocation(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

}
