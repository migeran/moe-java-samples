package com.migeran.speakhere;

import ios.NSObject;
import ios.uikit.UIWindow;
import ios.uikit.c.UIKit;
import ios.uikit.protocol.UIApplicationDelegate;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Generated;

public class Main extends NSObject implements UIApplicationDelegate {

	public static void main(String[] args) {
		UIKit.UIApplicationMain(0, null, null, Main.class.getName());
	}

	@Generated("NatJ")
	public static native Main alloc();

	@Generated("NatJ")
	protected Main(Pointer peer) {
		super(peer);
	}

	private UIWindow window;

	@Override
	public void setWindow(UIWindow value) {
		window = value;
	}

	@Override
	public UIWindow window() {
		return window;
	}
}
