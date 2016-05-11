package com.migeran.objcapp;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.general.ann.Runtime;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.moe.natj.objc.ann.Selector;

import ios.NSObject;

@ObjCClassName("CounterService")
@RegisterOnStartup
public class CounterService extends NSObject {

    protected CounterService(Pointer peer) {
        super(peer);
    }

    private static ICounterService INSTANCE = CounterServiceImpl.alloc().init();

    @Selector("get")
    public static ICounterService get() {
        return INSTANCE;
    }
}
