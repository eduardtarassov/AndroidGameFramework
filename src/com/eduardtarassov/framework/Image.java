package com.eduardtarassov.framework;

import android.graphics.ImageFormat;

/**
 * Created by Eduard on 2/13/14.
 */
public interface Image {
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
