package com.projectCid.struttureDati;

import java.util.Date;

public class CompagniaAssicurativa {
	String denominazione;
	String numeroPolizza;
	String numeroCartaVerde;
	Date periodoValiditaDal;
	Date periodoValiditaAl;
	Agenzia agenzia;
	boolean coperturaDanniMateriali;
	
	/**
	 * @return the denominazione
	 */
	public String getDenominazione() {
		return denominazione;
	}
	
	/**
	 * @param denominazione the denominazione to set
	 */
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	
	/**
	 * @return the numeroPolizza
	 */
	public String getNumeroPolizza() {
		return numeroPolizza;
	}
	
	/**
	 * @param numeroPolizza the numeroPolizza to set
	 */
	public void setNumeroPolizza(String numeroPolizza) {
		this.numeroPolizza = numeroPolizza;
	}
	
	/**
	 * @return the numeroCartaVerde
	 */
	public String getNumeroCartaVerde() {
		return numeroCartaVerde;
	}
	
	/**
	 * @param numeroCartaVerde the numeroCartaVerde to set
	 */
	public void setNumeroCartaVerde(String numeroCartaVerde) {
		this.numeroCartaVerde = numeroCartaVerde;
	}
	
	/**
	 * @return the periodoValiditaDal
	 */
	public Date getPeriodoValiditaDal() {
		return periodoValiditaDal;
	}
	
	/**
	 * @param periodoValiditaDal the periodoValiditaDal to set
	 */
	public void setPeriodoValiditaDal(Date periodoValiditaDal) {
		this.periodoValiditaDal = periodoValiditaDal;
	}
	
	/**
	 * @return the periodoValiditaAl
	 */
	public Date getPeriodoValiditaAl() {
		return periodoValiditaAl;
	}
	
	/**
	 * @param periodoValiditaAl the periodoValiditaAl to set
	 */
	public void setPeriodoValiditaAl(Date periodoValiditaAl) {
		this.periodoValiditaAl = periodoValiditaAl;
	}
	
	/**
	 * @return the agenzia
	 */
	public Agenzia getAgenzia() {
		return agenzia;
	}
	
	/**
	 * @param agenzia the agenzia to set
	 */
	public void setAgenzia(Agenzia agenzia) {
		this.agenzia = agenzia;
	}
	
	/**
	 * @return the coperturaDanniMateriali
	 */
	public boolean isCoperturaDanniMateriali() {
		return coperturaDanniMateriali;
	}
	
	/**
	 * @param coperturaDanniMateriali the coperturaDanniMateriali to set
	 */
	public void setCoperturaDanniMateriali(boolean coperturaDanniMateriali) {
		this.coperturaDanniMateriali = coperturaDanniMateriali;
	}
	
}
