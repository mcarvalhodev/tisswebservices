package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.CancelaGuiaWS;
import br.gov.ans.padroes.tiss.schemas.ReciboCancelaGuiaWS;

@Endpoint
public class CancelaGuiaEndpoint {
	
	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "cancelaGuiaWS")
	@ResponsePayload
	public ReciboCancelaGuiaWS endpoint(@RequestPayload CancelaGuiaWS payload) {
		return new ReciboCancelaGuiaWS();
	}
}
