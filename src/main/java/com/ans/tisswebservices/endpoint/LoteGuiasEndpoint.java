package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.LoteGuiasWS;
import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoWS;

@Endpoint
public class LoteGuiasEndpoint {

	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "loteGuiasWS")
	@ResponsePayload
	public ProtocoloRecebimentoWS endpoint(@RequestPayload LoteGuiasWS payload) {
		return new ProtocoloRecebimentoWS();
	}
}
