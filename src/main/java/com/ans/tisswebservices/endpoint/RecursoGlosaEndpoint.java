package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.LoteRecursoGlosaWS;
import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoRecursoWS;

@Endpoint
public class RecursoGlosaEndpoint {

	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "loteRecursoGlosaWS")
	@ResponsePayload
	public ProtocoloRecebimentoRecursoWS endpoint(@RequestPayload LoteRecursoGlosaWS payload) {
		return new ProtocoloRecebimentoRecursoWS();
	}
}
