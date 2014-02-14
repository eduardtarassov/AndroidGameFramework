package com.eduardtarassov.framework.implementation;

/**
 * The AndroidSound interface uses the SoundPool and an integer ID to keep track of various sounds, play them, and dispose them from memory.
 */

import android.media.SoundPool;

import com.eduardtarassov.framework.Sound;

public class AndroidSound implements Sound {
    int soundId;
    SoundPool soundPool;

    public AndroidSound(SoundPool soundPool, int soundId) {
        this.soundId = soundId;
        this.soundPool = soundPool;
    }

    @Override
    public void play(float volume) {
        soundPool.play(soundId, volume, volume, 0, 0, 1);
    }

    @Override
    public void dispose() {
        soundPool.unload(soundId);
    }

}
