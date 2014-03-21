package com.projectCid.struttureDati;

public class Testimone {
	
	String cognome;
	String nome;
	Indirizzo indirizzo;
	Telefono numero;
	char veicolo;
	
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	
	/**
	 * @param cognome the cognome to set
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
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return the indirizzo
	 */
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	
	/**
	 * @param indirizzo the indirizzo to set
	 */
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	/**
	 * @return the numero
	 */
	public Telefono getNumero() {
		return numero;
	}
	
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Telefono numero) {
		this.numero = numero;
	}

	/**
	 * @return the veicolo
	 */
	public char getVeicolo() {
		return veicolo;
	}

	/**
	 * @param veicolo the veicolo to set
	 */
	public void setVeicolo(char veicolo) {
		this.veicolo = veicolo;
	}
	
}
