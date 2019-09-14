package com.ans.tisswebservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.gov.ans.padroes.tiss.schemas.PedidoElegibilidadeWS;
import br.gov.ans.padroes.tiss.schemas.RespostaElegibilidadeWS;

@Endpoint
public class ElegibilidadeEndpoint {
	
	@PayloadRoot(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", localPart = "pedidoElegibilidadeWS")
	@ResponsePayload
	public RespostaElegibilidadeWS endpoint(@RequestPayload PedidoElegibilidadeWS payload ) {
		return new RespostaElegibilidadeWS();
	}
}
