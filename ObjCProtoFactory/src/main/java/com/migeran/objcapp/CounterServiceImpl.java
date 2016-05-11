package com.migeran.objcapp;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.Runtime;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.Selector;

import ios.NSObject;

@Runtime(ObjCRuntime.class)
public class CounterServiceImpl extends NSObject implements ICounterService {

    private int counter;

    protected CounterServiceImpl(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    @Owned
    public static native CounterServiceImpl alloc();

    @Selector("init")
    public native CounterServiceImpl init();

    @Selector("increment")
    public int increment() {
        return ++counter;
    }

    @Selector("getCount")
    public int getCount() {
        return counter;
    }

}
