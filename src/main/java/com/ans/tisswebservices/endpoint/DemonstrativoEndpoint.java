package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.DemonstrativoRetornoWS;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoDemonstrativoRetornoWS;

@Endpoint
public class DemonstrativoEndpoint {	
																					    
	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "solicitacaoDemonstrativoRetornoWS")
	@ResponsePayload
	public DemonstrativoRetornoWS endpoint(@RequestPayload SolicitacaoDemonstrativoRetornoWS payload) {
		return null;
	}
}
