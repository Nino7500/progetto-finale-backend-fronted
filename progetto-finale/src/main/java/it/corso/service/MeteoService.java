package it.corso.service;

import java.util.List;

import it.corso.dto.DatiMeteoDto;
import it.corso.model.DatiMeteo;

public interface MeteoService {
	
    List<DatiMeteoDto> listaDatiMeteo();

    DatiMeteoDto findByCitta(String citta);

    DatiMeteo salvaDatoMeteo(DatiMeteoDto datoMeteoDto);


}