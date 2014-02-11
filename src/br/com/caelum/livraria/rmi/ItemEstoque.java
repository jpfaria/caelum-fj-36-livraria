package br.com.caelum.livraria.rmi;

import java.io.Serializable;

public class ItemEstoque implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//private transient String codigo; --> Quando transient o atributo não é serializado
	private String codigo;
	private Integer quantidade;
	
	public ItemEstoque(String codigo, Integer quantidade) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	
	
}
