package com.noice.noice.util;

import com.parse.ParseUser;

public class Utils {

    /**
     * During the app upgrade, enabling automatic users doesn't seem to be called from
     * Application.onCreate().  This will check and enable that if the user is null
     */
    public static void initUserIfNull() {
        if (ParseUser.getCurrentUser() == null) {
            // if this wasn't called before (in case of app upgrade), we do it now
            ParseUser.enableAutomaticUser();
        }
    }
}
