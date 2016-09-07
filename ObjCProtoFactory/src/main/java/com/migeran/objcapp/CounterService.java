package com.migeran.objcapp;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;

@ObjCClassName("CounterService")
@RegisterOnStartup
public class CounterService extends NSObject {

    protected CounterService(Pointer peer) {
        super(peer);
    }

    private static ICounterService INSTANCE = new ICounterService() {

        private int counter;

        @Override
        public int increment() {
            return ++counter;
        }

        @Override
        public int getCount() {
            return counter;
        }
    };

    @Selector("get")
    public static ICounterService get() {
        return INSTANCE;
    }
}
