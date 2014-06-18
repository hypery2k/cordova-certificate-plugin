//
//  CDVCertificate.h
//  RTC
//
//  Created by Martin Reinhardt on 26.05.14.
//
//

#import <Cordova/CDVPlugin.h>

@interface CDVCertificate : CDVPlugin

- (void)setUntrusted:(CDVInvokedUrlCommand*)command;

@end
