package de.martinreinhardt.cordova.plugins;


import android.util.Log;
import org.apache.cordova.*;
import org.json.JSONException;

import android.content.Context;

/**
 *
 * Certificate Plugin for Cordova
 * 
 * author, Martin Reinhardt on 26.05.14.
 * 
 */
public class CertificatesPlugin extends CordovaPlugin {

    private static final String LOG_TAG = "Certificates";

    /**
     * Executes the request.
     *
     * This method is called from the WebView thread. To do a non-trivial amount of work, use:
     *     cordova.getThreadPool().execute(runnable);
     *
     * To run on the UI thread, use:
     *     cordova.getActivity().runOnUiThread(runnable);
     *
     * @param action          The action to execute. (Currently "setUntrusted only")
     * @param args            The exec() arguments.
     * @param callbackContext The callback context used when calling back into JavaScript.
     * @return                Whether the action was valid.
     *
     */
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("setUntrusted")) {
            boolean allowUntrusted = args.getBoolean(0);
            Log.d(LOG_TAG, "Setting allowUntrusted to " + allowUntrusted);
            CordovaActivity ca = (CordovaActivity) this.cordova.getActivity();
            webView.clearSslPreferences();
            webView.clearCache(true);
            ca.allowUntrusted = allowUntrusted;
            ca.clearCache();
            callbackContext.success();
            return true;
        }
        callbackContext.error("Invalid Command");
        return false;
    }
    
    public void setUntrusted() {
    }
}