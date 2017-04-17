package edu.bj.infraestrutura.localidade.model;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

/**
 * 
 * <h1>Enum das regiões</h1><br>
 * 
 * @create 17 de abr de 2017
 * @update
 * @author WilliamRodrigues
 * @version 1.0.0
 *
 */
@JsonFormat(shape = Shape.OBJECT)
public enum Regiao {
	CENTROOESTE("CENTROOESTE", "Centro-Oeste"),
	NORDESTE("NORDESTE", "Nordeste"),
	NORTE("NORTE", "Nordeste"),
	SUDESTE("SUDESTE", "Sudeste"),
	SUL("SUL", "Sul");

	private Regiao(String codigo, String descricao) {
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

	public static Regiao getByCodigo(String codigo) {
		for (Regiao tipo : values()) {
			if (tipo.codigo.equals(codigo))
				return tipo;
		}

		return null;
	}

	public static List<Regiao> getList() {
		return Arrays.asList(Regiao.values());
	}
}
