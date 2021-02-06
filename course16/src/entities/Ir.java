package entities;

public abstract class Ir {
	
	private String name;
	private double renda;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public Ir(String name, double renda) {
		this.name = name;
		this.renda = renda;
	}
	
	public abstract  double imposto();
	
	public String toString() {
		return "Nome"+getName()+", Imposto pago: "+String.format("%.2f", imposto());
	}
}
