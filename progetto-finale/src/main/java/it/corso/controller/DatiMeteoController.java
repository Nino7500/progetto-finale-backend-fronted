package it.corso.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.corso.dto.DatiMeteoDto;
import it.corso.model.DatiMeteo;
import it.corso.service.MeteoService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/meteo")
public class DatiMeteoController {

	
	@Autowired
    private MeteoService meteoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/dati")
    public Response listaDatiMeteo() {
        List<DatiMeteoDto> meteoDtoList = meteoService.listaDatiMeteo();
        return Response.ok(meteoDtoList).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/salva")
    public Response salvaDatoMeteo(DatiMeteoDto datoMeteoDto) {
        
        try {
            // Salva i dati meteo associandoli all'utente specificato
            DatiMeteo meteo = meteoService.salvaDatoMeteo(datoMeteoDto);
            return Response.ok(meteo).build();
        } catch (EntityNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Si è verificato un errore durante il salvataggio dei dati meteo").build();
        }
    }
}
	