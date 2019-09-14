package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.AutorizacaoProcedimentoWS;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoProcedimentoWS;

@Endpoint
public class ProcedimentoEndpoint {

	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "solicitacaoProcedimentoWS")
	@ResponsePayload
	public AutorizacaoProcedimentoWS endpoint(@RequestPayload SolicitacaoProcedimentoWS payload) {
		return new AutorizacaoProcedimentoWS();
	}
}
