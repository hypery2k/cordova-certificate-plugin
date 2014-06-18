//
//  CDVCertificate.h
//  RTC
//
//  Created by Martin Reinhardt on 26.05.14.
//
//

#import "CDVInvokedUrlCommand.h"

@interface CDVCertificate : CDVPlugin

- (void)setUntrusted:(CDVInvokedUrlCommand*)command;

@end
