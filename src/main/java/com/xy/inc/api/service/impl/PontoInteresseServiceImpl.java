package com.xy.inc.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xy.inc.api.model.PontoInteresse;
import com.xy.inc.api.repository.PontoInteresseRepository;
import com.xy.inc.api.service.PontoInteresseService;
import com.xy.inc.api.utils.LocateUtils;

@Service
public class PontoInteresseServiceImpl implements PontoInteresseService{
	@Autowired
	private PontoInteresseRepository pontoInteresseRepository;
	
	@Override
	public PontoInteresse salvarPontoInteresse(PontoInteresse pontoInteresse) {
		return pontoInteresseRepository.save(pontoInteresse);
	}
	
	@Override
	public List<PontoInteresse> buscarPontosInterese() {
		return pontoInteresseRepository.findAll();
	}
	 
	@Override
	public List<PontoInteresse> buscarPontosProximos(Integer codx, Integer cody, Integer distMax) {
		List<PontoInteresse> pontosProximos = new ArrayList<PontoInteresse>();
		
		List<PontoInteresse> pontos = buscarPontosInterese();
		if(!pontos.isEmpty()) {
			for(PontoInteresse ponto: buscarPontosInterese()) {
				Double dist = LocateUtils.calculaDistancia(codx, cody, ponto.getCoordenadax(),  ponto.getCoordenaday());
				if(Double.compare(dist, distMax.doubleValue()) < 0)  {
					pontosProximos.add(ponto);
				}
			
			}	
		}
		
		return pontosProximos;
	}

}
