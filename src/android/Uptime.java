package com.silvius.uptime;

import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

import android.os.SystemClock;

import org.apache.cordova.CordovaPlugin;

public class Uptime extends CordovaPlugin {

    CallbackContext mCallbackContext;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getSystemUptime")) {
            callbackContext.success(Long.toString(SystemClock.uptimeMillis()));
        } else {
            callbackContext.error("Invalid action");
            return false;
        }
        return true;
    }

}
