package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.LoteAnexoWS;
import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoAnexoWS;

@Endpoint
public class LoteAnexoEndpoint {
	
	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "loteAnexoWS")
	@ResponsePayload
	public ProtocoloRecebimentoAnexoWS endpoint(@RequestPayload LoteAnexoWS payload) {
		return new ProtocoloRecebimentoAnexoWS();
	}
}
