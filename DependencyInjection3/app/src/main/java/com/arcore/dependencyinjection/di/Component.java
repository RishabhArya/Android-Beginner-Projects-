package com.arcore.dependencyinjection.di;

import android.util.AndroidException;

import com.arcore.dependencyinjection.ClassOne;
import com.arcore.dependencyinjection.MainActivity;

@dagger.Component(modules = {ClassOne.class})
public interface Component  {
    void inject(MainActivity mainActivity);

}
