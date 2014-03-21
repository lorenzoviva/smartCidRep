package com.projectCid.struttureDati;

public class ModuloCircostanzeIncidente {
	private boolean[] circostanzeIncidenteA = new boolean[18];
	private boolean[] circostanzeIncidenteB = new boolean[18];

	/**
	 * 0: 1: in fermata / in sosta 2: ripartiva dopo una sosta 3: stava
	 * parcheggiando 4: usciva da un parcheggio, da un luogo privato, da una
	 * strada vicinale 5: entrava in un parcheggio, in un luogo privato, in una
	 * strada vicinale 6: si immetteva in una piazza a senso rotatorio 7:
	 * circolava su una piazza a centro rotatorio 8: tamponava procendo nello
	 * stesso senso e nella stessa fila 9: procedeva nello stesso senso ma in
	 * una fila diversa 10: cambiava fila 11: sorpassava 12: girava a destra 13:
	 * girava a sinistra 14: retrocedeva 15: invadeva la sede stradale riservata
	 * alla circolazione in senso inverso 16: proveniva da destra 17: non aveva
	 * osservato il segnale di precedenza o di semaforo rosso
	 */

	/**
	 * @return the circostanzeIncidenteA
	 */
	public boolean[] getCircostanzeIncidenteA() {
		return circostanzeIncidenteA;
	}

	/**
	 * @param circostanzeIncidenteA
	 *            the circostanzeIncidenteA to set
	 */
	public void setCircostanzeIncidenteA(boolean[] circostanzeIncidenteA) {
		this.circostanzeIncidenteA = circostanzeIncidenteA;
	}

	/**
	 * @param circostanzeIncidenteA
	 *            [i] the circostanzeIncidenteA[i] to set
	 */
	public void setCircostanzeIncidenteA(boolean circostanzeIncidenteA, int i) {
		this.circostanzeIncidenteA[i] = circostanzeIncidenteA;
	}

	/**
	 * @return the circostanzeIncidenteA[i]
	 */
	public boolean getCircostanzeIncidenteA(int i) {
		return circostanzeIncidenteA[i];
	}

	/**
	 * @return the circostanzeIncidenteB
	 */
	public boolean[] getCircostanzeIncidenteB() {
		return circostanzeIncidenteB;
	}

	/**
	 * @param circostanzeIncidenteB
	 *            the circostanzeIncidenteB to set
	 */
	public void setCircostanzeIncidenteB(boolean[] circostanzeIncidenteB) {
		this.circostanzeIncidenteB = circostanzeIncidenteB;
	}

	/**
	 * @param circostanzeIncidenteB
	 *            [i] the circostanzeIncidenteB[i] to set
	 */
	public void setCircostanzeIncidenteB(boolean circostanzeIncidenteB, int i) {
		this.circostanzeIncidenteB[i] = circostanzeIncidenteB;
	}

	/**
	 * @return the circostanzeIncidenteB[i]
	 */
	public boolean getCircostanzeIncidenteB(int i) {
		return circostanzeIncidenteB[i];
	}

	public String getTipoCircostanzaIncidente(int i) {
		switch (i) {
		case 0:
			return "";
		case 1:
			return "in fermata / in sosta";
		case 2:
			return "ripartiva dopo una sosta";
		case 3:
			return "stava parcheggiando";
		case 4:
			return "usciva da un parcheggio, da un luogo privato, da una strada vicinale";
		case 5:
			return "entrava in un parcheggio, in un luogo privato, in una strada vicinale";
		case 6:
			return "si immetteva in una piazza a senso rotatorio";
		case 7:
			return "circolava su una piazza a centro rotatorio";
		case 8:
			return "tamponava procendo nello stesso senso e nella stessa fila";
		case 9:
			return "procedeva nello stesso senso ma in una fila diversa";
		case 10:
			return "cambiava fila";
		case 11:
			return "sorpassava";
		case 12:
			return "girava a destra";
		case 13:
			return "girava a sinistra";
		case 14:
			return "retrocedeva";
		case 15:
			return "invadeva la sede stradale riservata alla circolazione in senso inverso";
		case 16:
			return "proveniva da destra";
		case 17:
			return "non aveva osservato il segnale di precedenza o di semaforo rosso";
		default:
			return "errore";
		}

	}
}
