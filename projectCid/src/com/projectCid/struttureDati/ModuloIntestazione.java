package com.projectCid.struttureDati;

import java.util.ArrayList;
import java.util.Date;

public class ModuloIntestazione {

	Date dataEoraIncidente;
	Indirizzo luogo;
	boolean feriti;
	boolean danniAltriVeicoli;
	boolean danniOggetti;
	ArrayList<Testimone> testimoni = new ArrayList<Testimone>();

	/**
	 * @return the dataEoraIncidente
	 */
	public Date getDataEoraIncidente() {
		return dataEoraIncidente;
	}

	/**
	 * @param dataEoraIncidente
	 *            the dataEoraIncidente to set
	 */
	public void setDataEoraIncidente(Date dataEoraIncidente) {
		this.dataEoraIncidente = dataEoraIncidente;
	}

	/**
	 * @return the luogo
	 */
	public Indirizzo getLuogo() {
		return luogo;
	}

	/**
	 * @param luogo
	 *            the luogo to set
	 */
	public void setLuogo(Indirizzo luogo) {
		this.luogo = luogo;
	}

	/**
	 * @return the feriti
	 */
	public boolean isFeriti() {
		return feriti;
	}

	/**
	 * @param feriti
	 *            the feriti to set
	 */
	public void setFeriti(boolean feriti) {
		this.feriti = feriti;
	}

	/**
	 * @return the danniAltriVeicoli
	 */
	public boolean isDanniAltriVeicoli() {
		return danniAltriVeicoli;
	}

	/**
	 * @param danniAltriVeicoli
	 *            the danniAltriVeicoli to set
	 */
	public void setDanniAltriVeicoli(boolean danniAltriVeicoli) {
		this.danniAltriVeicoli = danniAltriVeicoli;
	}

	/**
	 * @return the danniOggetti
	 */
	public boolean isDanniOggetti() {
		return danniOggetti;
	}

	/**
	 * @param danniOggetti
	 *            the danniOggetti to set
	 */
	public void setDanniOggetti(boolean danniOggetti) {
		this.danniOggetti = danniOggetti;
	}

	/**
	 * @return the testimoni
	 */
	public ArrayList<Testimone> getTestimoni() {
		return testimoni;
	}

	/**
	 * @param testimoni
	 *            the testimoni to set
	 */
	public void setTestimoni(ArrayList<Testimone> testimoni) {
		this.testimoni = testimoni;
	}

}
