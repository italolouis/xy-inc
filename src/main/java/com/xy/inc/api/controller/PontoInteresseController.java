package com.xy.inc.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.xy.inc.api.dto.PontoInteresseDTO;
import com.xy.inc.api.dto.PontoReferenciaDTO;
import com.xy.inc.api.model.PontoInteresse;
import com.xy.inc.api.service.PontoInteresseService;

@RestController
@RequestMapping("/pontosInteresse")
public class PontoInteresseController {
	
	@Autowired
	private PontoInteresseService pontoInteresseService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<PontoInteresse> salvar(@Valid @RequestBody PontoInteresseDTO pontoInteresse, HttpServletResponse response) {
		PontoInteresse pontoInteresseSave = pontoInteresseService.salvarPontoInteresse(pontoInteresse.convert());
		return ResponseEntity.status(HttpStatus.CREATED).body(pontoInteresseSave);
	}
	
	@GetMapping
	public ResponseEntity<List<PontoInteresse>> listar() {
		List<PontoInteresse> pontosInteresse = pontoInteresseService.buscarPontosInterese();
		return !pontosInteresse.isEmpty() ? ResponseEntity.ok(pontosInteresse) : ResponseEntity.notFound().build();
	}
	
	@GetMapping("/buscarPontosProximo")
    public ResponseEntity<List<PontoInteresse>> listarPontosProximos(@Valid @RequestBody PontoReferenciaDTO pontoReferenciaDTO) {
		List<PontoInteresse> pontosProximo = pontoInteresseService.buscarPontosProximos(pontoReferenciaDTO.getCodx(), pontoReferenciaDTO.getCody(), pontoReferenciaDTO.getDistMax());
		return !pontosProximo.isEmpty() ? ResponseEntity.ok(pontosProximo) : ResponseEntity.notFound().build();
    }

}
