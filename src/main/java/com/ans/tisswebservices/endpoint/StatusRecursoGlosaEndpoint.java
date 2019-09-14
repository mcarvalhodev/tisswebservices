package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.SituacaoProtocoloRecursoWS;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoStatusRecursoGlosaWS;

@Endpoint
public class StatusRecursoGlosaEndpoint {

	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "solicitacaoStatusRecursoGlosaWS")
	@ResponsePayload
	public SituacaoProtocoloRecursoWS endpoint(@RequestPayload SolicitacaoStatusRecursoGlosaWS payload) {
		return new SituacaoProtocoloRecursoWS();
	}
}
