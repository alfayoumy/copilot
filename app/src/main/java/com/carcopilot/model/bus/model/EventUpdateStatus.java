package com.carcopilot.model.bus.model;

import com.carcopilot.model.bus.EventModel;
import com.carcopilot.model.entity.GpsStatusEntity;

public class EventUpdateStatus implements EventModel {

    private GpsStatusEntity status;

    public EventUpdateStatus(GpsStatusEntity status) {
        this.status = status;
    }

    public GpsStatusEntity getStatus() {
        return status;
    }

}

