package com.example.instagramclone;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ahQwBX99GIlQcAEFa9SCqYEPyD6tt1th46f9D6mu")
                .clientKey("PnO85bFRMC1QTSpnBpSF9xs4zVkMv7YDsxNGM1Bf")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
