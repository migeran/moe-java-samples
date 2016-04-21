//
//  CounterService.m
//  JNIFromObjC
//

#import "jni.h"
#import "CounterService.h"

static JavaVM *vm;
static jclass counterServiceClass;
static jmethodID incrementMethod;
static jmethodID getCountMethod;

static JNIEnv* attachJNI(BOOL *didAttachThread) {
    assert(didAttachThread != NULL);
    JNIEnv *env;
    jint result = (*vm)->GetEnv(vm, (void **)&env, JNI_VERSION_1_6);
    if (result == JNI_EDETACHED) {
        assert((*vm)->AttachCurrentThread(vm, &env, NULL) == JNI_OK);
        *didAttachThread = true;
    }
    return env;
}

static void detachJNI(BOOL didAttachThread) {
    if (didAttachThread) {
        (*vm)->DetachCurrentThread(vm);
    }
}

@implementation CounterService

+ (void)init {
    jsize numVMs = 0;
    NSAssert(JNI_GetCreatedJavaVMs(&vm, 1, &numVMs) == JNI_OK, @"JNI_GetCreatedJavaVMs failed");
    NSAssert(numVMs > 0, @"Expected at least one VM to exist");
    
    BOOL didAttachThread = false;
    JNIEnv *env = attachJNI(&didAttachThread);
    counterServiceClass = (*env)->FindClass(env, "com/migeran/objcapp/CounterService");
    if (!counterServiceClass) {
        [NSException raise:@"Failed to find class com.migeran.objcapp.CounterService" format:@""];
    }
    incrementMethod = (*env)->GetStaticMethodID(env, counterServiceClass, "increment", "()I");
    if (!incrementMethod) {
        [NSException raise:@"Failed to find method com.migeran.objcapp.CounterService.increment()I" format:@""];
    }
    getCountMethod = (*env)->GetStaticMethodID(env, counterServiceClass, "getCount", "()I");
    if (!getCountMethod) {
        [NSException raise:@"Failed to find method com.migeran.objcapp.CounterService.getCount()I" format:@""];
    }
    detachJNI(didAttachThread);
}

+ (int)increment {
    // Calls CounterService.increment()
    BOOL didAttachThread = false;
    JNIEnv *env = attachJNI(&didAttachThread);
    jint result = (*env)->CallStaticIntMethod(env, counterServiceClass, incrementMethod);
    detachJNI(didAttachThread);
    return result;
}

+ (int)getCount {
    // Calls CounterService.getCount()
    BOOL didAttachThread = false;
    JNIEnv *env = attachJNI(&didAttachThread);
    jint result = (*env)->CallStaticIntMethod(env, counterServiceClass, getCountMethod);
    detachJNI(didAttachThread);
    return result;
}

@end
