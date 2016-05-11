//
//  CounterService.h
//  ObjCClassFactory
//

#import <Foundation/Foundation.h>

@interface CounterService : NSObject

+ (CounterService *)get;

- (int)increment;

- (int)getCount;

@end
