package edu.bj.infraestrutura.localidade.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

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
@Entity
public class Pais extends LocalGeografico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sigla;
	private String siglaMoeda;
	
	private List<Uf> ufs = new ArrayList<>();

	@Column(length = 2)
	@Size(min = 2, max = 2)
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(length = 3)
	@Size(min = 3, max = 3)
	public String getSiglaMoeda() {
		return siglaMoeda;
	}

	public void setSiglaMoeda(String siglaMoeda) {
		this.siglaMoeda = siglaMoeda;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pais")
	public List<Uf> getUfs() {
		return ufs;
	}

	public void setUfs(List<Uf> ufs) {
		this.ufs = ufs;
	}
	
	
}
