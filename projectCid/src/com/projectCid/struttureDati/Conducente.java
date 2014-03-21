package com.projectCid.struttureDati;

import java.util.Date;

public class Conducente {

	String cognome;
	String nome;
	Date dataDiNascita;
	String codiceFiscale;
	Indirizzo indirizzo;
	String stato;
	Telefono telefono;
	String email;
	String numeroPatente;
	String categoriaPatente;
	Date patenteValidaFinoAl;

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome
	 *            the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the dataDiNascita
	 */
	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	/**
	 * @param dataDiNascita
	 *            the dataDiNascita to set
	 */
	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	/**
	 * @param codiceFiscale
	 *            the codiceFiscale to set
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	/**
	 * @return the indirizzo
	 */
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	/**
	 * @param indirizzo
	 *            the indirizzo to set
	 */
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	/**
	 * @return the stato
	 */
	public String getStato() {
		return stato;
	}

	/**
	 * @param stato
	 *            the stato to set
	 */
	public void setStato(String stato) {
		this.stato = stato;
	}

	/**
	 * @return the telefono
	 */
	public Telefono getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 *            the telefono to set
	 */
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the numeroPatente
	 */
	public String getNumeroPatente() {
		return numeroPatente;
	}

	/**
	 * @param numeroPatente
	 *            the numeroPatente to set
	 */
	public void setNumeroPatente(String numeroPatente) {
		this.numeroPatente = numeroPatente;
	}

	/**
	 * @return the categoriaPatente
	 */
	public String getCategoriaPatente() {
		return categoriaPatente;
	}

	/**
	 * @param categoriaPatente
	 *            the categoriaPatente to set
	 */
	public void setCategoriaPatente(String categoriaPatente) {
		this.categoriaPatente = categoriaPatente;
	}

	/**
	 * @return the patenteValidaFinoAl
	 */
	public Date getPatenteValidaFinoAl() {
		return patenteValidaFinoAl;
	}

	/**
	 * @param patenteValidaFinoAl
	 *            the patenteValidaFinoAl to set
	 */
	public void setPatenteValidaFinoAl(Date patenteValidaFinoAl) {
		this.patenteValidaFinoAl = patenteValidaFinoAl;
	}

}
