package com.migeran.objcapp;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("CounterService")
@RegisterOnStartup
public class CounterService extends NSObject {
    private static int counter = 0;

    protected CounterService(Pointer peer) {
        super(peer);
    }

    @Selector("increment")
    public static int increment() {
        return ++counter;
    }

    @Selector("getCount")
    public static int getCount() {
        return counter;
    }
}
