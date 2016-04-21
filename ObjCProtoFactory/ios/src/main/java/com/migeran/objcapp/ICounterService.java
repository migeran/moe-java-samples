package com.migeran.objcapp;


import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;

@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CounterService")
public interface ICounterService {

    @Selector("increment")
    int increment();

    @Selector("getCount")
    int getCount();

}
