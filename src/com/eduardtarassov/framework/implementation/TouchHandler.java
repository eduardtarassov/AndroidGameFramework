package com.eduardtarassov.framework.implementation;

/**
 * Created by Eduard on 2/14/14.
 * This simple class handles touch events by checking for touchDown and the X and Y coordinates.
 */

import java.util.List;

import android.view.View.OnTouchListener;

import com.eduardtarassov.framework.Input.TouchEvent;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();
}