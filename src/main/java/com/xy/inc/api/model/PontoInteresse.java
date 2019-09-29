package com.xy.inc.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ponto_interesse")
public class PontoInteresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotNull
	@Size(min=3, max=40)
	private String nome;
	
	private Integer coordenadax;
	
	private Integer coordenaday;

	public PontoInteresse() {
		super();
	}
	
	public PontoInteresse(@NotNull @Size(min = 3, max = 40) String nome, Integer coordenadax, Integer coordenaday) {
		super();
		this.nome = nome;
		this.coordenadax = coordenadax;
		this.coordenaday = coordenaday;
	}



	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((coordenadax == null) ? 0 : coordenadax.hashCode());
		result = prime * result + ((coordenaday == null) ? 0 : coordenaday.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PontoInteresse other = (PontoInteresse) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (coordenadax == null) {
			if (other.coordenadax != null)
				return false;
		} else if (!coordenadax.equals(other.coordenadax))
			return false;
		if (coordenaday == null) {
			if (other.coordenaday != null)
				return false;
		} else if (!coordenaday.equals(other.coordenaday))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
