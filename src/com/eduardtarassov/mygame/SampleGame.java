package com.eduardtarassov.mygame;

/**
 * Created by Eduard on 2/14/14.
 */

import com.eduardtarassov.framework.Screen;
import com.eduardtarassov.framework.implementation.AndroidGame;

public class SampleGame extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this);
    }
    /*Do we really need this method ??? */
    @Override
    public void onBackPressed() {
        getCurrentScreen().backButton();
    }
}
