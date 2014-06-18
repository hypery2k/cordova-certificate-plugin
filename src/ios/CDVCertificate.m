//
//  CDVCertificate.m
//  RTC
//
//  Created by Martin Reinhardt on 26.05.14.
//
//

#import "CDVCertificate.h"
#import <Cordova/CDV.h>
#import "NSURLRequest+AllowUntrustedCertificates.h"

@implementation CDVCertificate

- (void)setUntrusted:(CDVInvokedUrlCommand*)command {
    bool isUntrusted = [[command.arguments objectAtIndex:0] boolValue];
    
    [NSURLRequest setAllowAllRequests:isUntrusted];
    
    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
