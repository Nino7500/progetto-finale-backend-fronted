package it.corso.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.DatiMeteoDao;
import it.corso.dao.UtenteDao;
import it.corso.dto.DatiMeteoDto;
import it.corso.model.DatiMeteo;

@Service
public class MeteoServiceImpl implements MeteoService {

	@Autowired
    private DatiMeteoDao datiMeteoDao;
	
	@Autowired
	private UtenteDao utenteDao;

	private ModelMapper mapper = new ModelMapper();
    
    @Override
    public List<DatiMeteoDto> listaDatiMeteo() {
       List<DatiMeteo> meteo = datiMeteoDao.findAll();
       List<DatiMeteoDto> meteoDto = new ArrayList();
       
       meteo.forEach(u -> meteoDto.add(mapper.map(u, DatiMeteoDto.class)));
       return meteoDto;
    }

    @Override
    public DatiMeteoDto findByCitta(String citta) {
        DatiMeteo meteo = datiMeteoDao.findByCitta(citta);
        DatiMeteoDto meteoDto = mapper.map(meteo, DatiMeteoDto.class);
        return meteoDto;
    }

    @Override
    public DatiMeteo salvaDatoMeteo(DatiMeteoDto datoMeteoDto) {
      

        // Crea un nuovo oggetto DatiMeteo e imposta i valori dai dati DTO
        DatiMeteo datoMeteo = new DatiMeteo();
        datoMeteo.setCitta(datoMeteoDto.getName());
        datoMeteo.setRegione(datoMeteoDto.getRegion());
        datoMeteo.setPaese(datoMeteoDto.getCountry());
        datoMeteo.setLatitudine(datoMeteoDto.getLat());
        datoMeteo.setLongitudine(datoMeteoDto.getLon());
        datoMeteo.setTimezone_id(datoMeteoDto.getTz_id());
        datoMeteo.setLocaltime_epoch(datoMeteoDto.getLocaltime_epoch());
        datoMeteo.setUltima_aggiornamento(datoMeteoDto.getLast_updated());
        datoMeteo.setTemperatura_celsius(datoMeteoDto.getTemp_c());
        datoMeteo.setCondizione(datoMeteoDto.getCondition());
        datoMeteo.setVelocità_vento_kph(datoMeteoDto.getWind_kph());
        datoMeteo.setDirezione_vento(datoMeteoDto.getWind_degree());
        datoMeteo.setDirezione_vento_nome(datoMeteoDto.getWind_dir());
        datoMeteo.setPressione_mb(datoMeteoDto.getPressure_mb());
        datoMeteo.setPrecip_mm(datoMeteoDto.getPrecip_mm());
        datoMeteo.setUmidità(datoMeteoDto.getHumidity());
        datoMeteo.setNuvole(datoMeteoDto.getCloud());
        datoMeteo.setSensazione_termica_celsius(datoMeteoDto.getFeelslike_c());
        datoMeteo.setVisibilità_km(datoMeteoDto.getVis_km());
        datoMeteo.setUv(datoMeteoDto.getUv());
        datoMeteo.setRaffica_kph(datoMeteoDto.getGust_kph());
 
        
        // Salva i dati meteo nel database e restituisci l'oggetto salvato
        return datiMeteoDao.save(datoMeteo);
    }

    // Altri metodi utili per il frontend
}
