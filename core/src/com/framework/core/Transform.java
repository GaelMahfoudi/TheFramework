package com.framework.core;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Gaël on 06/05/2015.
 */
public class Transform {

    private Vector2 position;
    private Vector2 orientation;

    public Transform() {
        position = new Vector2(0,0);
        orientation = new Vector2(1,0);
    }

    public Transform(Vector2 position, Vector2 orientation){
        this.position = position;
        this.orientation = orientation;
    }


    public void lookAt(Vector2 point) {

    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Vector2 getOrientation() {
        return orientation;
    }

    public void setOrientation(Vector2 orientation) {
        this.orientation = orientation;
    }
}
