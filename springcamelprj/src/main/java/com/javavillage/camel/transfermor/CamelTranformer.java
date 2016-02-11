package com.javavillage.camel.transfermor;

public class CamelTranformer {
	public String transform(String body)
	{
		System.out.println("invoking the transformContent method");
		String upperCaseContent=body.toUpperCase();
		//System.out.println(object);
		return upperCaseContent;
	}

}
