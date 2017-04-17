package edu.bj.infraestrutura.localidade.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * <h1>Representação dos bairros</h1>
 * <p>
 * Ex: Centro, Alphaville, Vila Formosa, Jardim Social e etc.
 * </p>
 * 
 * @create 17 de abr de 2017
 * @update
 * @author williamrodrigues
 * @version 1.0.0
 *
 */
@Entity
public class Bairro extends LocalGeografico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nomeAbrev;
	private String codIbge;
	private String cep;
	private String faixaCepInicio;
	private String faixaCepFim;
	
	private Localidade localidade;
	private List<Logradouro> logradouros = new ArrayList<>();

	@Column(length = 60)
	public String getNomeAbrev() {
		return nomeAbrev;
	}

	public void setNomeAbrev(String nomeAbrev) {
		this.nomeAbrev = nomeAbrev;
	}

	@Column(length = 20)
	public String getCodIbge() {
		return codIbge;
	}

	public void setCodIbge(String codIbge) {
		this.codIbge = codIbge;
	}

	@Column(length = 20)
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(length = 20)
	public String getFaixaCepInicio() {
		return faixaCepInicio;
	}

	public void setFaixaCepInicio(String faixaCepInicio) {
		this.faixaCepInicio = faixaCepInicio;
	}

	@Column(length = 20)
	public String getFaixaCepFim() {
		return faixaCepFim;
	}

	public void setFaixaCepFim(String faixaCepFim) {
		this.faixaCepFim = faixaCepFim;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bairro")
	public List<Logradouro> getLogradouros() {
		return logradouros;
	}

	public void setLogradouros(List<Logradouro> logradouros) {
		this.logradouros = logradouros;
	}
}
