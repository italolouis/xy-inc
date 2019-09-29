package com.xy.inc.api.service;

import java.util.List;

import com.xy.inc.api.model.PontoInteresse;

public interface PontoInteresseService {
	public PontoInteresse salvarPontoInteresse(PontoInteresse pontoInteresse);
	
	public List<PontoInteresse> buscarPontosInterese();
	
	public List<PontoInteresse> buscarPontosProximos(Integer codx, Integer cody, Integer distMax);

}
