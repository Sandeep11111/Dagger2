package com.example.sandeepkumarsingh.dagger2.component;

import android.app.Application;
import android.content.Context;

import com.example.sandeepkumarsingh.dagger2.DemoApplication;
import com.example.sandeepkumarsingh.dagger2.data.DataManager;
import com.example.sandeepkumarsingh.dagger2.data.DbHelper;
import com.example.sandeepkumarsingh.dagger2.data.SharedPrefsHelper;
import com.example.sandeepkumarsingh.dagger2.di.ApplicationContext;
import com.example.sandeepkumarsingh.dagger2.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sandeepkumarsingh on 1/21/18.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}