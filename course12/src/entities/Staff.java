package entities;

public class Staff {
	
	private Integer id;
	private String name;
	private Double salario;
	
	public Staff(int id,String name,double salario) {
		this.id=id;
		this.name=name;
		this.salario=salario;
	}
	
	public int getId() {
		return id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		 this.name=name;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void newsalario(double ajuste) {
		salario+=salario*ajuste/100;
	}
	
	public String toString() {
		return "id: "+id+", Nome: "+name+", Salario: "+ salario;
	}
	
	
}
