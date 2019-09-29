package com.xy.inc.api.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.xy.inc.api.model.PontoInteresse;

public class PontoInteresseDTO {
	
	private String nome;
	
	@NotNull(message = "Ponto x é obrigatório")
	@Min(value = 0L, message = "Ponto x deve ser positivo")
	private Integer coordenadax;
	
	@NotNull(message = "Ponto y é obrigatório")
	@Min(value = 0L, message = "Ponto y deve ser positivo")
	private Integer coordenaday;
	
	public PontoInteresseDTO() {
		super();
	}

	public PontoInteresseDTO(String nome,
			@NotNull(message = "Ponto x é obrigatório") @Min(value = 0, message = "Ponto x deve ser positivo") Integer coordenadax,
			@NotNull(message = "Ponto y é obrigatório") @Min(value = 0, message = "Ponto y deve ser positivo") Integer coordenaday) {
		super();
		this.nome = nome;
		this.coordenadax = coordenadax;
		this.coordenaday = coordenaday;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCoordenadax() {
		return coordenadax;
	}

	public void setCoordenadax(Integer coordenadax) {
		this.coordenadax = coordenadax;
	}

	public Integer getCoordenaday() {
		return coordenaday;
	}

	public void setCoordenaday(Integer coordenaday) {
		this.coordenaday = coordenaday;
	}
	
	public PontoInteresse convert() {
		return new PontoInteresse(nome, coordenadax, coordenaday);
	}

}
