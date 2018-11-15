package com.chenyu.rpc.provider;

import com.chenyu.rpc.api.IRpcHello;

public class RpcHello implements IRpcHello {

	@Override
	public String hello(String name) {
		return "Hello , " + name + "!";
	}

}
