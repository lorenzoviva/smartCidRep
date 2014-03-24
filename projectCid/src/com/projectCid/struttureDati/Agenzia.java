
package com.projectCid.struttureDati;

public class Agenzia {

	String denominazione;

	Indirizzo indirizzo;

	String stato;

	Telefono telefono;

	String email;

	/**
	 * @return the denominazione
	 */
	public String getDenominazione() {

		return denominazione;
	}

	/**
	 * @param denominazione
	 *            the denominazione to set
	 */
	public void setDenominazione(String denominazione) {

		this.denominazione = denominazione;
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

}
