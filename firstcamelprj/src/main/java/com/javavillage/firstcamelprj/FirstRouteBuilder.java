package com.javavillage.firstcamelprj;

import org.apache.camel.builder.RouteBuilder;

public class FirstRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
	from("file:D:/WS/CAMEL_WS/camel/firstcamelprj/input?noop=true")
	.process(new LogProcessor())
	.bean(new Transormer(),"transformContent")
	.to("file:D:/WS/CAMEL_WS/camel/firstcamelprj/output");	
	}
}
