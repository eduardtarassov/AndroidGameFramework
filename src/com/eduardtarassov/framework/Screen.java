package com.eduardtarassov.framework;

/**
 * Created by Eduard on 2/13/14.
 */
public abstract class Screen {
    protected final Game game;

    public Screen(Game game) {
        this.game = game;
    }
    //deltaTime takes into account how much time passed since the last time the method was called. we wil use it to create framerate independent movement
    public abstract void update(float deltaTime);

    public abstract void paint(float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();

    public abstract void backButton();
}
