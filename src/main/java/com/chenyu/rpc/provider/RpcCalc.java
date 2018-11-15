package com.chenyu.rpc.provider;

import com.chenyu.rpc.api.IRpcCalc;

public class RpcCalc implements IRpcCalc{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mult(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}

}
