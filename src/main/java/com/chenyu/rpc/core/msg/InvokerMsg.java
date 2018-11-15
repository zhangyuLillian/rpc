package com.chenyu.rpc.core.msg;

import lombok.Data;

import java.io.Serializable;
@Data
public class InvokerMsg implements Serializable{

	private String className;	//服务名称
	private String methodName;	//调用哪个方法
	private Class<?>[] parames;	//参数列表
	private Object[] values;	//参数值
	
}
