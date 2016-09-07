package com.migeran.objcapp;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("CounterService")
@RegisterOnStartup
public class CounterService extends NSObject {

    protected CounterService(Pointer peer) {
        super(peer);
    }

    private static class CounterServiceImpl extends CounterService {

        private int counter = 0;

        protected CounterServiceImpl(Pointer peer) {
            super(peer);
        }

        @Owned
        @Selector("alloc")
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

    private static CounterService INSTANCE = CounterServiceImpl.alloc().init();

    @Selector("get")
    public static CounterService get() {
        return INSTANCE;
    }
}
