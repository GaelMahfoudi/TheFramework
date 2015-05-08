package com.framework.graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Gaël on 05/05/2015.
 */
public class Material {

    private Sprite sprite;

    public Material() {
        sprite = new Sprite();
    }

    public Material(Sprite sprite) {
        this.sprite = sprite;
    }

    public Material(Texture texture) {
        sprite = new Sprite(texture);
    }

    public void changeTexture(Texture texture) {
        sprite.setTexture(texture);
    }

    public void changeTextureRegion() {

    }


}
