package datorveikals;

import java.io.Serializable;

public class Dators implements Serializable {
	private static final long serialVersionUID = -5230460108178231930L;
	private boolean strada = false;
	private String marka, modelis;
	int RAM;
	private double cena;
	
	public Dators () {
	
	}
	public boolean irStrada() {
		return strada;
	}
	
	public String dabutMarka() {
		return marka;
	}
	public String dabutModelis() {
		return modelis;
	}
	public int dabutRAM() {
		return RAM;
	}
	public double dabutCena() {
		return cena;
	}
	
	public void iestatitStrada(boolean strada) {
		this.strada = strada;
	}
	public void iestatitMarka(String marka) {
		this.marka = marka;
	}
	public void iestatitModelis(String modelis) {
		this.modelis = modelis;
	}
	public void iestatitRAM(int RAM) {
		this.RAM = RAM;
	}
	public void iestatitCena(double cena) {
		this.cena = cena;	
  } 
	public String iegutInfo() {
		return "Datora/planšetdatora marka "+marka
				+ "\nDatora/planšetdatora modelis "+modelis
				+"\nDatora/planšetdatora RAM "+RAM
				+"\nDatora/planšetdatora cena "+cena
				+"\nVai darbojas: " + (strada ? "Jā" : "Nē");
	}
 }
