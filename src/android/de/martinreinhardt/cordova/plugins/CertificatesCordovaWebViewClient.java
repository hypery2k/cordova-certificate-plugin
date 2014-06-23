/*
 
 The MIT License (MIT)
 
 Copyright (c) 2014 Martin Reinhardt
 
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
 
 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.
 
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 
 Certificate Plugin for Cordova
 
 */
package de.martinreinhardt.cordova.plugins;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebViewClient;

import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/**
 * 
 * Certificates Cordova WebView Client
 * 
 * author, Martin Reinhardt on 23.06.14.
 * 
 * Copyright Martin Reinhardt 2014. All rights reserved.
 * 
 */
public class CertificatesCordovaWebViewClient extends CordovaWebViewClient {

    /**
     * Logging Tag
     */
    public static final String TAG = "CertificatesCordovaWebViewClient";

    private boolean allowUntrusted = false;

    /**
     * 
     * @param cordova
     */
    public CertificatesCordovaWebViewClient(CordovaInterface cordova) {
        super(cordova);
    }

    /**
     * @return true of usage of untrusted (self-signed) certificates is allowed,
     *         otherwise false
     */
    public boolean isAllowUntrusted() {
        return allowUntrusted;
    }

    /**
     * 
     * 
     * @param pAllowUntrusted
     *            the allowUntrusted to set
     */
    public void setAllowUntrusted(final boolean pAllowUntrusted) {
        this.allowUntrusted = pAllowUntrusted;
    }

    /**
     * @see org.apache.cordova.CordovaWebViewClient#onReceivedSslError(WebView,
     *      SslErrorHandler, SslError)
     */
    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler,
            SslError error) {
        Log.d(TAG, "onReceivedSslError. Proceed? " + isAllowUntrusted());
        if (isAllowUntrusted()) {
            handler.proceed();
        } else {
            handler.cancel();
        }
    }
}