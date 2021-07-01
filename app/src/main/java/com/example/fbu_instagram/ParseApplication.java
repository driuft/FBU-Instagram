package com.example.fbu_instagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Y7WyK1NXsGRg1uTBv7uAqW8h5h5Yoqi9dOorxVTo")
                .clientKey("f64djMYZFFITpD9iA5ZzIOxZOeVS2biLixa9129t")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
