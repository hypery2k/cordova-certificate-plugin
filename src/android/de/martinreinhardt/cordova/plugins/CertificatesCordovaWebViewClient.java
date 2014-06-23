package de.martinreinhardt.cordova.plugins;


import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewClient;

import android.util.Log;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;


/**
 *
 * Certificate Plugin for Cordova
 *
 * author, Martin Reinhardt on 26.05.14.
 *
 */
public class CertificatesCordovaWebViewClient extends CordovaWebViewClient {

    public static final String TAG = "CertificatesCordovaWebViewClient";

    private boolean allowUntrusted = false;

    public CertificatesCordovaWebViewClient(CordovaInterface cordova) {
        super(cordova);
    }

    public void setAllowUntrusted(final boolean pAllowUntrusted) {
        this.allowUntrusted = pAllowUntrusted;
    }

    public boolean isAllowUntrusted() {
       return allowUntrusted;
    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        Log.d(TAG, "onReceivedSslError. Proceed? " + isAllowUntrusted());
        if (isAllowUntrusted()) {
            handler.proceed();
        } else {
            handler.cancel();
        }
    }
}