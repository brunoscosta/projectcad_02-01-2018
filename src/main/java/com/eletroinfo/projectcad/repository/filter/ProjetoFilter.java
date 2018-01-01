package com.eletroinfo.projectcad.repository.filter;

import java.math.BigDecimal;

import com.eletroinfo.projectcad.model.Status;

public class ProjetoFilter {
	
	//atributos para a pesquisa de projetos
	private Long codigo;
	private String nome;
	private Status status;
	private String dataInicio;
	private String dataFim;
	private BigDecimal duracao;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public BigDecimal getDuracao() {
		return duracao;
	}
	public void setDuracao(BigDecimal duracao) {
		this.duracao = duracao;
	}
	

	
}
