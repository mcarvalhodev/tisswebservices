package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.SituacaoAutorizacaoWS;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoStatusAutorizacaoWS;

@Endpoint
public class StatusAutorizacaoEndpoint {

	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "solicitacaoStatusAutorizacaoWS")
	@ResponsePayload
	public SituacaoAutorizacaoWS endpoint(@RequestPayload SolicitacaoStatusAutorizacaoWS payload) {
		return new SituacaoAutorizacaoWS();
	}
}
