package com.framework.core;

import com.framework.graphics.Renderer;

/**
 * Created by Gaël on 05/05/2015.
 */


public class GameObject {

    private Renderer renderer;
    private Transform transform;


    public GameObject() {
        renderer = new Renderer();
        transform = new Transform();
    }

    public GameObject(Renderer renderer, Transform transform) {
        this.renderer = renderer;
        this.transform = transform;
    }


    public Renderer getRenderer() {
        return renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public Transform getTransform() {
        return transform;
    }

    public void setTransform(Transform transform) {
        this.transform = transform;
    }
}
