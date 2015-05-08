package com.framework.controllers;

import com.framework.core.Controllable;
import com.framework.core.Controller;
import com.framework.core.Event;

import java.util.ArrayList;

/**
 * Created by Gaël on 08/05/2015.
 */
public class BasicController implements Controller {


    protected ArrayList<Event> triggeringEvents;
    protected Controllable controllable;

    public BasicController() {
        triggeringEvents = new ArrayList<Event>();
    }

    @Override
    public void update() {

    }

    @Override
    public void askControllableToPerform() {
        controllable.performAction();
    }


    public void addEvent(Event e) {
        triggeringEvents.add(e);
    }
    
    public ArrayList<Event> getTriggeringEvents() {
        return triggeringEvents;
    }

    public void setTriggeringEvents(ArrayList<Event> triggeringEvents) {
        this.triggeringEvents = triggeringEvents;
    }
}
