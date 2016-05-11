package com.migeran.objcapp;


import com.intel.moe.natj.general.ann.Runtime;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.moe.natj.objc.ann.Selector;

@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CounterService")
public interface ICounterService {

    @Selector("increment")
    int increment();

    @Selector("getCount")
    int getCount();

}
