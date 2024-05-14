package it.corso.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="DatoMeteo")
public class DatiMeteo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_d")
    private int id;

	@Column(name = "name")
	private String citta;

	@Column(name = "region")
	private String regione;

	@Column(name = "country")
	private String paese;

	@Column(name = "lat")
	private double latitudine;

	@Column(name = "lon")
	private double longitudine;

	@Column(name = "tz_id")
	private String timezone_id;

	@Column(name = "localtime_epoch")
	private long localtime_epoch;

	@Column(name = "location_localtime")
	private String localtime;

	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	@Column(name = "last_updated")
	private String ultima_aggiornamento;

	@Column(name = "temp_c")
	private double temperatura_celsius;

	@Column(name = "condition1")
	private String condizione;


	@Column(name = "wind_kph")
	private double velocità_vento_kph;

	@Column(name = "wind_degree")
	private int direzione_vento;

	@Column(name = "wind_dir")
	private String direzione_vento_nome;

	@Column(name = "pressure_mb")
	private double pressione_mb;

	@Column(name = "precip_mm")
	private double precip_mm;

	@Column(name = "humidity")
	private int umidità;

	@Column(name = "cloud")
	private int nuvole;

	@Column(name = "feelslike_c")
	private double sensazione_termica_celsius;

	@Column(name = "vis_km")
	private double visibilità_km;

	@Column(name = "uv")
	private double uv;

	@Column(name = "gust_kph")
	private double raffica_kph;
    
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String città) {
		this.citta = città;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	public String getPaese() {
		return paese;
	}
	public void setPaese(String paese) {
		this.paese = paese;
	}
	public double getLatitudine() {
		return latitudine;
	}
	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}
	public double getLongitudine() {
		return longitudine;
	}
	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}
	public String getTimezone_id() {
		return timezone_id;
	}
	public void setTimezone_id(String timezone_id) {
		this.timezone_id = timezone_id;
	}
	public long getLocaltime_epoch() {
		return localtime_epoch;
	}
	public void setLocaltime_epoch(long localtime_epoch) {
		this.localtime_epoch = localtime_epoch;
	}
	public String getLocaltime() {
		return localtime;
	}
	public void setLocaltime(String localtime) {
		this.localtime = localtime;
	}
	public String getUltima_aggiornamento() {
		return ultima_aggiornamento;
	}
	public void setUltima_aggiornamento(String ultima_aggiornamento) {
		this.ultima_aggiornamento = ultima_aggiornamento;
	}
	public double getTemperatura_celsius() {
		return temperatura_celsius;
	}
	public void setTemperatura_celsius(double temperatura_celsius) {
		this.temperatura_celsius = temperatura_celsius;
	}
	public String getCondizione() {
		return condizione;
	}
	public void setCondizione(String condizione) {
		this.condizione = condizione;
	}

	public double getVelocità_vento_kph() {
		return velocità_vento_kph;
	}
	public void setVelocità_vento_kph(double velocità_vento_kph) {
		this.velocità_vento_kph = velocità_vento_kph;
	}
	public int getDirezione_vento() {
		return direzione_vento;
	}
	public void setDirezione_vento(int direzione_vento) {
		this.direzione_vento = direzione_vento;
	}
	public String getDirezione_vento_nome() {
		return direzione_vento_nome;
	}
	public void setDirezione_vento_nome(String direzione_vento_nome) {
		this.direzione_vento_nome = direzione_vento_nome;
	}
	public double getPressione_mb() {
		return pressione_mb;
	}
	public void setPressione_mb(double pressione_mb) {
		this.pressione_mb = pressione_mb;
	}
	public double getPrecip_mm() {
		return precip_mm;
	}
	public void setPrecip_mm(double precip_mm) {
		this.precip_mm = precip_mm;
	}
	public int getUmidità() {
		return umidità;
	}
	public void setUmidità(int umidità) {
		this.umidità = umidità;
	}
	public int getNuvole() {
		return nuvole;
	}
	public void setNuvole(int nuvole) {
		this.nuvole = nuvole;
	}
	public double getSensazione_termica_celsius() {
		return sensazione_termica_celsius;
	}
	public void setSensazione_termica_celsius(double sensazione_termica_celsius) {
		this.sensazione_termica_celsius = sensazione_termica_celsius;
	}
	public double getVisibilità_km() {
		return visibilità_km;
	}
	public void setVisibilità_km(double visibilità_km) {
		this.visibilità_km = visibilità_km;
	}
	public double getUv() {
		return uv;
	}
	public void setUv(double uv) {
		this.uv = uv;
	}
	public double getRaffica_kph() {
		return raffica_kph;
	}
	public void setRaffica_kph(double raffica_kph) {
		this.raffica_kph = raffica_kph;
	}


  
}
