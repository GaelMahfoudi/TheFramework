package com.framework.graphics;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Gaël on 05/05/2015.
 */


public class Renderer implements Drawer {


    private Drawable objectToDraw;
    private Material material;
    private SpriteBatch batch;


    public Renderer() {
        objectToDraw = null;
        material = new Material();
        batch = new SpriteBatch();
    }

    public Renderer(Drawable objectToDraw, Material material, SpriteBatch batch) {
        this.objectToDraw = objectToDraw;
        this.material = material;
        this.batch = batch;
    }

    @Override
    public void draw() {

    }

    @Override
    public void update() {

    }

}
