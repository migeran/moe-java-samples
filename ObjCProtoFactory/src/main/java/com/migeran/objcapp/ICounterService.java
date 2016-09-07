package com.migeran.objcapp;


import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CounterService")
public interface ICounterService {

    @Selector("increment")
    int increment();

    @Selector("getCount")
    int getCount();

}
