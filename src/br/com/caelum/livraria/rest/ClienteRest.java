package br.com.caelum.livraria.rest;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import br.com.caelum.livraria.modelo.Pagamento;
import br.com.caelum.livraria.modelo.Transacao;

@Component
public class ClienteRest implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private static final String SERVER_URI = "http://fj36webservicerest.herokuapp.com";
	private static final String ENTRY_POINT = "/v1/pagamento/";

	public Pagamento criarPagamento(Transacao transacao) {
		return null;
	}

	public Pagamento confirmarPagamento(Pagamento pagamento) {
		return null;
	}

}
