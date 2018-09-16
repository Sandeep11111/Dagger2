package com.example.sandeepkumarsingh.dagger2.module;

import android.app.Activity;
import android.content.Context;

import com.example.sandeepkumarsingh.dagger2.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sandeepkumarsingh on 1/21/18.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}
