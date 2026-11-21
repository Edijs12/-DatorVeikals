package datorveikals;

import javax.swing.JOptionPane;

public class Portativais extends Dators {
	private static final long serialVersionUID = -455148236029806277L;
	
	
	private int svars, baterijasSt;
	private boolean klaviaturaApgaismota = false;

	public Portativais() {
		
	}
	public int dabutSvars() {
		return svars;
	}
	public int dabutBaterijasSt() {
		return baterijasSt;
	}
	public boolean irKlaviaturaApgaismota() {
		return klaviaturaApgaismota;
	}
	public void iestatitSvars(int svars) {
		this.svars = svars;
	}
	public void iestatitBaterijasSt(int baterijasSt) {
		this.baterijasSt = baterijasSt;
	}
	public void iestatitKlaviaturaApgaismota(boolean klaviaturaApgaismota) {
		this.klaviaturaApgaismota = klaviaturaApgaismota;
	}
	public String parslegtApgaismojumu() {
		if (klaviaturaApgaismota == false) {
			klaviaturaApgaismota = true;
		}else {
			klaviaturaApgaismota = false;
		}
		return "Klaviatūras apgaismojums ieslēgts? "+ klaviaturaApgaismota;
	}
	public void palielinatCenu(double summa) {
		double esosaCena = dabutCena();	
		if(esosaCena > 0 && summa > 0) {
			double jaunaCena = esosaCena + summa;
			iestatitCena(jaunaCena);
		}else {
			JOptionPane.showMessageDialog(null,
					"Neizdevās palielināt cenu!", "Brīdinājums",
					JOptionPane.WARNING_MESSAGE);
		}
	}
	public void samazinatCenu(double summa) {
		double esosaCena = dabutCena();	
		double jaunaCena = esosaCena - summa;
		if(esosaCena > 0 && summa > 0 && jaunaCena >=0) {
			iestatitCena(jaunaCena);
		}else {

			JOptionPane.showMessageDialog(null,
					"Neizdevās samazināt cenu!", "Brīdinājums",
					JOptionPane.WARNING_MESSAGE);
			}
		}
	public void baterijasLaiks() {
		int batLaiks = dabutBaterijasSt();
		if(batLaiks >= 6) {
			JOptionPane.showMessageDialog(null,
					"Nevajag turēt pie lādētāja", "Paziņojums",
					JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,
					"Labāk turēt pie lādētāja", "Paziņojums",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	@Override
	public String iegutInfo() {
		return super.iegutInfo()
				+"\nDatora/planšetdatora svars ir "+svars
				+"\nDatora/planšetdatora baterijas laiks ir " +baterijasSt
				+"\nDatora/planšetdatora klaviatūra apgaimsota"+ (klaviaturaApgaismota ? "Jā" : "Nē");
		
				
	}
}
