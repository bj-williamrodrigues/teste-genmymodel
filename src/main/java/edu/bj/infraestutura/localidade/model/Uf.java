package edu.bj.infraestrutura.localidade.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * <h1>Representação das unidades de federação (UF)</h1>
 * 
 * @create 17 de abr de 2017
 * @update
 * @author williamrodrigues
 * @version 1.0.0
 *
 */
@Entity
public class Uf extends LocalGeografico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sigla;
	
	private Regiao regiao;
	
	private Pais pais;
	private List<Localidade> localidades = new ArrayList<>();
	
	@Column(length = 2)
	@Size(min = 2, max = 2)
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	@Enumerated(EnumType.STRING)
	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "uf")
	public List<Localidade> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(List<Localidade> localidades) {
		this.localidades = localidades;
	}
}
