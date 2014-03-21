package com.projectCid.struttureDati;

public class Indirizzo {
	String comune;
	String provincia;
	String via;
	int numeroCivico;
	/**
	 * TODO: valutare se conviene utilizzare un oggetto di tipo CAP
	 */
	String cap;
	String stato;
	
	/**
	 * @return the comune
	 */
	public String getComune() {
		return comune;
	}
	
	/**
	 * @param comune the comune to set
	 */
	public void setComune(String comune) {
		this.comune = comune;
	}
	
	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}
	
	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	/**
	 * @return the via
	 */
	public String getVia() {
		return via;
	}
	
	/**
	 * @param via the via to set
	 */
	public void setVia(String via) {
		this.via = via;
	}
	
	/**
	 * @return the numeroCivico
	 */
	public int getNumeroCivico() {
		return numeroCivico;
	}
	
	/**
	 * @param numeroCivico the numeroCivico to set
	 */
	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	
	/**
	 * @return the cap
	 */
	public String getCap() {
		return cap;
	}
	
	/**
	 * @param cap the cap to set
	 */
	public void setCap(String cap) {
		this.cap = cap;
	}
	
	/**
	 * @return the stato
	 */
	public String getStato() {
		return stato;
	}
	
	/**
	 * @param stato the stato to set
	 */
	public void setStato(String stato) {
		this.stato = stato;
	}
	
}
