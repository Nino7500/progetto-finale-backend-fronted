package it.corso.dto;

public class DatiMeteoDto {
	

	private String name;
	private String region;
	private String country;
	private double lat;
	private double lon;
	private String tz_id;
	private long localtime_epoch;
	private String last_updated;
	private double temp_c;
	private String condition;
	private double wind_kph;
	private int wind_degree;
	private String wind_dir;
	private double pressure_mb;
	private double precip_mm;
	private int humidity;
	private int cloud;
	private double feelslike_c;
	private double vis_km;
	private double uv;
	private double gust_kph;
	private int utente_id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getTz_id() {
		return tz_id;
	}
	public void setTz_id(String tz_id) {
		this.tz_id = tz_id;
	}
	public long getLocaltime_epoch() {
		return localtime_epoch;
	}
	public void setLocaltime_epoch(long localtime_epoch) {
		this.localtime_epoch = localtime_epoch;
	}
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	public double getTemp_c() {
		return temp_c;
	}
	public void setTemp_c(double temp_c) {
		this.temp_c = temp_c;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public double getWind_kph() {
		return wind_kph;
	}
	public void setWind_kph(double wind_kph) {
		this.wind_kph = wind_kph;
	}
	public int getWind_degree() {
		return wind_degree;
	}
	public void setWind_degree(int wind_degree) {
		this.wind_degree = wind_degree;
	}
	public String getWind_dir() {
		return wind_dir;
	}
	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}
	public double getPressure_mb() {
		return pressure_mb;
	}
	public void setPressure_mb(double pressure_mb) {
		this.pressure_mb = pressure_mb;
	}
	public double getPrecip_mm() {
		return precip_mm;
	}
	public void setPrecip_mm(double precip_mm) {
		this.precip_mm = precip_mm;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getCloud() {
		return cloud;
	}
	public void setCloud(int cloud) {
		this.cloud = cloud;
	}
	public double getFeelslike_c() {
		return feelslike_c;
	}
	public void setFeelslike_c(double feelslike_c) {
		this.feelslike_c = feelslike_c;
	}
	public double getVis_km() {
		return vis_km;
	}
	public void setVis_km(double vis_km) {
		this.vis_km = vis_km;
	}
	public double getUv() {
		return uv;
	}
	public void setUv(double uv) {
		this.uv = uv;
	}
	public double getGust_kph() {
		return gust_kph;
	}
	public void setGust_kph(double gust_kph) {
		this.gust_kph = gust_kph;
	}
	public int getUtente_id() {
		return utente_id;
	}
	public void setUtente_id(int utente_id) {
		this.utente_id = utente_id;
	}
	
		
	   
	}