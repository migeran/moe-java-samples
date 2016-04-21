package com.migeran.objcapp;

import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.RegisterOnStartup;
import com.intel.inde.moe.natj.objc.ann.ObjCClassName;
import com.intel.inde.moe.natj.objc.ann.Selector;

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
