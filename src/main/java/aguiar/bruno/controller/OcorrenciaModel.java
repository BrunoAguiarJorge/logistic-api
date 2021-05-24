package aguiar.bruno.controller;

import java.time.OffsetDateTime;

public class OcorrenciaModel {

	private Long id;
	private String descricao;
	private OffsetDateTime dataRegistre;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public OffsetDateTime getDataRegistre() {
		return dataRegistre;
	}
	public void setDataRegistre(OffsetDateTime dataRegistre) {
		this.dataRegistre = dataRegistre;
	}
	
	
}
