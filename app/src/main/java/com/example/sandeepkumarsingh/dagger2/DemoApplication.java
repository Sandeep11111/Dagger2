package com.example.sandeepkumarsingh.dagger2;

import android.app.Application;
import android.content.Context;

import com.example.sandeepkumarsingh.dagger2.component.ApplicationComponent;
import com.example.sandeepkumarsingh.dagger2.component.DaggerApplicationComponent;
import com.example.sandeepkumarsingh.dagger2.data.DataManager;
import com.example.sandeepkumarsingh.dagger2.module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by sandeepkumarsingh on 1/21/18.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
