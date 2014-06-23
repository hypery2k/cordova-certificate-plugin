package de.martinreinhardt.cordova.plugins;


import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewClient;

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
public class CertifcateCordovaWebViewClient extends CordovaWebViewClient {

    private boolean allowUntrusted = false;

    public CertifcateCordovaWebViewClient(CordovaInterface cordova) {
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
        Log.d("onReceivedSslError. Proceed? " + isAllowUntrusted());
        if (isAllowUntrusted()) {
            handler.proceed();
        } else {
            handler.cancel();
        }
    }
}