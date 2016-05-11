//
//  AppDelegate.m
//  ObjCClassFactory
//

#import "CounterService.h"
#import "ViewController.h"

@implementation ViewController

- (IBAction)clicked:(id)sender {
    [[CounterService get] increment];
    self.label.text = [NSString stringWithFormat:@"Click Nr. %d", [[CounterService get] getCount]];
}

@end
