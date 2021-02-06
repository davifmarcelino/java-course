package entities;

public class Fisica extends Ir {
	private double saude;

	public double getSaude() {
		return saude;
	}

	public void setSaude(double saude) {
		this.saude = saude;
	}

	public Fisica(String name, double renda, double saude) {
		super(name, renda);
		this.saude = saude;
	}

	@Override
	public double imposto() {
		if(getRenda()<20000) {
			return getRenda()*0.15-getSaude()*0.5;
		}
		else {
			return getRenda()*0.25-getSaude()*0.5;
		}
	}
}
