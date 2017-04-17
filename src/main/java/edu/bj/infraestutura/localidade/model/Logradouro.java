package edu.bj.infraestrutura.localidade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * 
 * <h1>Representação dos logradouros</h1>
 * <p>
 * Ex: Visconde de Guarapuava, 24 de Maio, BR-277, Centenário do Paraná e etc.
 * </p>
 * 
 * @create 17 de abr de 2017
 * @update
 * @author williamrodrigues
 * @version 1.0.0
 *
 */
@Entity
public class Logradouro extends LocalGeografico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cep;
	private String complemento;

	private Bairro bairro;
	private Localidade localidade;
	private TipoLogradouro tipoLogradouro;

	@Column(length = 20)
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
}
