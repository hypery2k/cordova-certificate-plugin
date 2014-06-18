//
//  NSURLRequest+AllowUntrustedCertificates.h
//  RTC
//
//  Created by Martin Reinhardt on 26.05.14.
//
//

#import <Foundation/Foundation.h>

@interface NSURLRequest (AllowUntrustedCertificates)

+(void)setAllowAllRequests:(BOOL)allowRequests;
@end
