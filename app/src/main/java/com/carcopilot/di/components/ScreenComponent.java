package com.carcopilot.di.components;

import com.carcopilot.di.scopes.ScreenScope;
import com.carcopilot.ui.activities.DetectorActivity;

import dagger.Component;

@ScreenScope
@Component(dependencies = ApplicationComponent.class)
public interface ScreenComponent {


    void inject(DetectorActivity detectorActivity);
}
