package it.corso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.corso.model.DatiMeteo;

@Repository
public interface DatiMeteoDao extends JpaRepository<DatiMeteo, Integer> {
	
    DatiMeteo findByCitta(String citta);
}
