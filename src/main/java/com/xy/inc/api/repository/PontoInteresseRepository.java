package com.xy.inc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.xy.inc.api.model.PontoInteresse;

@Repository
@EnableJpaRepositories
public interface PontoInteresseRepository extends JpaRepository<PontoInteresse, Long>{

}
