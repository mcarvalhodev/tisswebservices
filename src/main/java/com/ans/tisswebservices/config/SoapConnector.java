package com.ans.tisswebservices.config;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapConnector extends WebServiceGatewaySupport{
	
	public Object marshalSendAndReceive(String uri, Object payload) {
		return getWebServiceTemplate().marshalSendAndReceive(uri, payload);
	}
}
