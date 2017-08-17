package com.google.firebase.codelab.friendlychat;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by uddhav on 8/17/17.
 */

public class OnLineTracker {

    public static String DATEFORMAT = "yyyy-MM-dd HH:mm:ss";
    public static String DATEFORMAT_SEISMICPORTAL = "yyyy-MM-dd'T'HH:mm:ss.S'Z'";

    public static boolean isOnline(Context ctx) {
        ConnectivityManager cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}