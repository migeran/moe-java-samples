//
//  AppDelegate.m
//  ImplObjCClassInJavaByInstance
//

#import <UIKit/UIKit.h>
#import "CounterService.h"

@interface ViewController : UIViewController

@property (strong, nonatomic) IBOutlet UILabel *label;

- (IBAction)clicked:(id)sender;

@property (strong) CounterService *service;

@end
