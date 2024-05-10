package com.carcopilot.utils.player;

import androidx.annotation.IdRes;

public interface PlayerAdapter {

    void loadMedia(@IdRes int resId);

    void reset();

}
