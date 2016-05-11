package com.migeran.objcapp;

import com.intel.moe.natj.general.ann.Keep;

@Keep
public class CounterService {
    private static int counter = 0;

    public static int increment() {
        return ++counter;
    }

    public static int getCount() {
        return counter;
    }
}
