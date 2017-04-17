package edu.bj.infraestrutura.localidade.model;

import javax.persistence.Column;

import edu.bj.infraestrutura.model.BaseModel;

/**
 * 
 * <h1>Representação dos tipos de logradouros</h1>
 * <p>
 * Ex: Rua, Avenida, Rodovia, Alamenda e etc.
 * </p>
 * 
 * @create 17 de abr de 2017
 * @update
 * @author williamrodrigues
 * @version 1.0.0
 *
 */
public class TipoLogradouro extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9174846448466262570L;

	private String descricao;
	private String abreviatura;

	@Column(length = 6)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
}
