package entities;

public class Juridica extends Ir {
	
	private int funcionarios;

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Juridica(String name, double renda, int funcionarios) {
		super(name, renda);
		this.funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		if(getFuncionarios()<10) {
			return getRenda()*0.16;
		}
		else {
			return getRenda()*0.14;
		}
	}
	
}
