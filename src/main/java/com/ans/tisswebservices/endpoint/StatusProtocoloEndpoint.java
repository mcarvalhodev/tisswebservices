package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.SituacaoProtocoloWS;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoStatusProtocoloWS;

@Endpoint
public class StatusProtocoloEndpoint {

	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "solicitacaoStatusProtocoloWS")
	@ResponsePayload
	public SituacaoProtocoloWS endpoint(@RequestPayload SolicitacaoStatusProtocoloWS payload) {
		return new SituacaoProtocoloWS();
	}
}
