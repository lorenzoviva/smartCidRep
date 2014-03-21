package com.projectCid.struttureDati;

public class Telefono {
	String prefisso;
	String numero;
	
	/**
	 * @return the prefisso
	 */
	public String getPrefisso() {
		return prefisso;
	}
	
	/**
	 * @param prefisso the prefisso to set
	 */
	public void setPrefisso(String prefisso) {
		this.prefisso = prefisso;
	}
	
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/**
	 * Restituisce il numero di telefono come intero
	 * @return il numero di telefono
	 */
	public int getTelefonoInt(){
		int a = Integer.parseInt(numero);
		int b = (int) (Math.pow(10, numero.length())*Integer.parseInt(prefisso));
		return a+b;
	}
	
}
