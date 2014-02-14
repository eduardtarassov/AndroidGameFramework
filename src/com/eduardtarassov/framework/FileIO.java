package com.eduardtarassov.framework;

import android.content.SharedPreferences;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Eduard on 2/13/14.
 */
public interface FileIO {
    public InputStream readFile(String file) throws IOException;

    public OutputStream writeFile(String file) throws IOException;

    public InputStream readAsset(String file) throws IOException;

    //SharedPreferences is an Android interface that lets you access and modify preference data.
    public SharedPreferences getSharedPref();
}
