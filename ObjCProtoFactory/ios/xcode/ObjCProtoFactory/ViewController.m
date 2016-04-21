//
//  AppDelegate.m
//  ObjCProtoFactory
//

#import "CounterService.h"
#import "ViewController.h"

@implementation ViewController

- (IBAction)clicked:(id)sender {
    id<CounterService> service = [CounterService get];
    [service increment];
    self.label.text = [NSString stringWithFormat:@"Click Nr. %d", [service getCount]];
}

@end
