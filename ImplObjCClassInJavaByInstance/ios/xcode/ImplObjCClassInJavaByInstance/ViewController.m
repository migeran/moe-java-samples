//
//  AppDelegate.m
//  ImplObjCClassInJavaByInstance
//

#import "ViewController.h"

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
    _service = [[CounterService alloc] init];
}

- (IBAction)clicked:(id)sender {
    [_service increment];
    self.label.text = [NSString stringWithFormat:@"Click Nr. %d", [_service getCount]];
}

@end
