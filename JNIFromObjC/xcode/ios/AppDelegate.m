//
//  AppDelegate.m
//  JNIFromObjC
//

#import "AppDelegate.h"
#import "CounterService.h"

@implementation AppDelegate

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
    
    // Initialize the CounterService
    [CounterService init];
    
    return YES;
}

@end
