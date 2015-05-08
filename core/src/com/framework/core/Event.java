package com.framework.core;

/**
 * Created by Gaël on 05/05/2015.
 */
public interface Event {

    /*
    La méthode update définit l'event. Ex : Appuie de la touche saut
                                            Collision entre deux choses.
     */
    public void update();

    /*
    L'event en question s'est t-il produit ?
     */
    public int getState();


}
