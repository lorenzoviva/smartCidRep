
package com.projectCid.struttureDati;

/**
 * Oggetto rappresentate la struttura del modulo CID
 */
public class CID {

	ModuloIntestazione intestazione;

	ModuloVeicolo veicoloA, veicoloB;

	ModuloCircostanzeIncidente circostanzeIncidente;

	ModuloGrafico grafico;

	/**
	 * @return the intestazione
	 */
	public ModuloIntestazione getIntestazione() {

		return intestazione;
	}

	/**
	 * @param intestazione
	 *            the intestazione to set
	 */
	public void setIntestazione(ModuloIntestazione intestazione) {

		this.intestazione = intestazione;
	}

	/**
	 * @return the veicoloA
	 */
	public ModuloVeicolo getVeicoloA() {

		return veicoloA;
	}

	/**
	 * @param veicoloA
	 *            the veicoloA to set
	 */

	public void setVeicoloA(ModuloVeicolo veicoloA) {

		this.veicoloA = veicoloA;
	}

	/**
	 * @return the veicoloB
	 */
	public ModuloVeicolo getVeicoloB() {

		return veicoloB;
	}

	/**
	 * @param veicoloB
	 *            the veicoloB to set
	 */
	public void setVeicoloB(ModuloVeicolo veicoloB) {

		this.veicoloB = veicoloB;
	}

	/**
	 * @return the circostanzeIncidente
	 */
	public ModuloCircostanzeIncidente getCircostanzeIncidente() {

		return circostanzeIncidente;
	}

	/**
	 * @param circostanzeIncidente
	 *            the circostanzeIncidente to set
	 */
	public void setCircostanzeIncidente(
			ModuloCircostanzeIncidente circostanzeIncidente) {

		this.circostanzeIncidente = circostanzeIncidente;
	}

	/**
	 * @return the grafico
	 */
	public ModuloGrafico getGrafico() {

		return grafico;
	}

	/**
	 * @param grafico
	 *            the grafico to set
	 */
	public void setGrafico(ModuloGrafico grafico) {

		this.grafico = grafico;
	}

}
