package com.xy.inc.api.dto;

import javax.validation.constraints.NotNull;

public class PontoReferenciaDTO {
	@NotNull(message = "Ponto x é obrigatório")
	private Integer codx;
	
	@NotNull(message = "Ponto y é obrigatório")
	private Integer cody;
	
	private String pontoReferencia;
	
	@NotNull(message = "Distândia máxima é obrigatório")
	private Integer distMax;
	
	public PontoReferenciaDTO() {
		super();
	}
	
	public Integer getCodx() {
		return codx;
	}

	public void setCodx(Integer codx) {
		this.codx = codx;
	}

	public Integer getCody() {
		return cody;
	}

	public void setCody(Integer cody) {
		this.cody = cody;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}
	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}
	
	public Integer getDistMax() {
		return distMax;
	}

	public void setDistMax(Integer distMax) {
		this.distMax = distMax;
	}

	@Override
	public String toString() {
		return "PontoReferenciaDTO [codx=" + codx + ", cody=" + cody + ", pontoReferencia=" + pontoReferencia
				+ ", distMax=" + distMax + "]";
	}

}
