package com.migeran.objcapp;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("CounterService")
@RegisterOnStartup
public class CounterService extends NSObject {
    private int counter = 0;

    protected CounterService(Pointer peer) {
        super(peer);
    }

    @Selector("increment")
    public int increment() {
        return ++counter;
    }

    @Selector("getCount")
    public int getCount() {
        return counter;
    }
}
