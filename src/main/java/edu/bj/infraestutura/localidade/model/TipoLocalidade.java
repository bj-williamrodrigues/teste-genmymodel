package edu.bj.infraestrutura.localidade.model;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

/**
 * 
 * <h1>Enum dos tipos de localidades</h1><br>
 * 
 * @create 17 de abr de 2017
 * @update
 * @author WilliamRodrigues
 * @version 1.0.0
 *
 */
@JsonFormat(shape = Shape.OBJECT)
public enum TipoLocalidade {
	DISTRITO("DISTRITO", "Distrito"), 
	MUNICIPIO("MUNICIPIO", "Município"), 
	POVOADO("POVOADO", "Povoado"), 
	REGIAOADMIN("REGIAOADMIN", "Região Administrativa");

	private TipoLocalidade(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	private String codigo;
	private String descricao;

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoLocalidade getByCodigo(String codigo) {
		for (TipoLocalidade tipo : values()) {
			if (tipo.codigo.equals(codigo))
				return tipo;
		}

		return null;
	}

	public static List<TipoLocalidade> getList() {
		return Arrays.asList(TipoLocalidade.values());
	}
}
