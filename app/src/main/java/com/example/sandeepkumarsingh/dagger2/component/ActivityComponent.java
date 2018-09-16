package com.example.sandeepkumarsingh.dagger2.component;

import com.example.sandeepkumarsingh.dagger2.MainActivity;
import com.example.sandeepkumarsingh.dagger2.di.PerActivity;
import com.example.sandeepkumarsingh.dagger2.module.ActivityModule;

import dagger.Component;

/**
 * Created by sandeepkumarsingh on 1/21/18.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
