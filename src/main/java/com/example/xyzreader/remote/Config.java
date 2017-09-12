package com.example.xyzreader.remote;

import android.util.Log;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://nspf.github.io/XYZReader/data.json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e("Config", ignored.getMessage());
        }

        BASE_URL = url;
    }
}
