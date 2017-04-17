package edu.bj.infraestrutura.localidade.model;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import edu.bj.infraestrutura.model.BaseModel;

/**
 * 
 * <h1>Representação dos paises</h1>
 * 
 * @create 17 de abr de 2017
 * @update
 * @author williamrodrigues
 * @version 1.0.0
 *
 */
@MappedSuperclass
public abstract class LocalGeografico extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	private LocalDate dtAtualizacao;

	@NotNull
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDtAtualizacao() {
		return dtAtualizacao;
	}

	public void setDtAtualizacao(LocalDate dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
}
