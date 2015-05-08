package com.framework.core;

import java.util.ArrayList;

/**
 * Created by Gaël on 05/05/2015.
 */
public class EventHandler {

    private ArrayList<Controller> listOfController;
    private ArrayList<Event> listOfEvent;

    public EventHandler() {
        listOfEvent = new ArrayList<Event>();
        listOfController = new ArrayList<Controller>();
    }

    public EventHandler(ArrayList<Event> e, ArrayList<Controller> c) {
        listOfController = c;
        listOfEvent = e;
    }

    public void update() {
        for(int i=0;i<listOfEvent.size();i++) {
            listOfEvent.get(i).update();
        }
    }

    public void addEvent(Event e) {
        listOfEvent.add(e);
    }

    public ArrayList<Event> getEvents() {
        return listOfEvent;
    }

    public void addController(Controller c) {
        listOfController.add(c);
    }

    public void removeController(int i) {
        listOfController.remove(i);
    }

    public void notifyControllers() {
        for(int i = 0; i<listOfController.size();i++) {
            listOfController.get(i).update();
        }
    }

}
