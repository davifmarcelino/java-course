package entities;

public class Employee {
	public String nome;
	public double salario;
	public double taxa;
	public double porcentagem=0;
	
	public double salario_liquido(){
		porcentagem = (porcentagem/100)+1;
		salario = salario*porcentagem;
		return salario - taxa;
	}
	
	public String toString() {
	return nome  +", $ " + String.format("%.2f", salario_liquido());
	}
}
