package rezolvareamea;

public class produs {
	
	public  String nume;
	public double PU;
	public  int cantitate;
	public String unitmasura;
	
	
	produs(String nume, double PU, int cantitate, String unitmasura){
		this.setNume(nume);
		this.setPU(PU);
		this.cantitate=cantitate;
		this.unitmasura=unitmasura;
	
		
	}
	

	public  String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public double getPU() {
		return PU;
	}

	public void setPU(double pU) {
		PU = pU;
	}

}
