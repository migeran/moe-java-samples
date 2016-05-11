//
//  CounterService.h
//  ObjCProtoFactory
//

#import <Foundation/Foundation.h>

@protocol CounterService <NSObject>

- (int)increment;

- (int)getCount;

@end

@interface CounterService : NSObject

+ (id<CounterService>)get;

@end
