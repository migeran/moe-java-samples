//
//  AppDelegate.m
//  JNIFromObjC
//

#import "CounterService.h"
#import "ViewController.h"

@implementation ViewController

- (IBAction)clicked:(id)sender {
    [CounterService increment];
    self.label.text = [NSString stringWithFormat:@"Click Nr. %d", [CounterService getCount]];
}

@end
