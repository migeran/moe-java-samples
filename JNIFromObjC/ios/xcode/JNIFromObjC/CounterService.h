//
//  CounterService.h
//  JNIFromObjC
//

#import <Foundation/Foundation.h>

@interface CounterService : NSObject

+ (void)init;

+ (int)increment;

+ (int)getCount;

@end
