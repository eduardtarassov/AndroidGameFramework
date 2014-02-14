package com.eduardtarassov.framework;
      /*
      1. A Game interface that ties every other interface together.

2. An Audio Interface that relies on (3.) a Music interface (for large audio files) and (4.) a Sound interface (for small audio files).

5. A Graphics interface that relies on (6.) an Image interface.

7. A Screen interface for displaying/changing game screens.

8. A FileIO interface for reading and writing files.

9. An Input Interface to take user input.

We will also create A Pool class to collect objects together.
       */
import android.app.Activity;
import android.os.Bundle;
import com.eduardtarassov.Android_Game.R;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
