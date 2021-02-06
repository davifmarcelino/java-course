package entities;

public class Alunos {

	public int primeiro,segundo,terceiro;
	public String nome;
	
	 public int soma() {
		 return primeiro + segundo + terceiro;
	 }
	 public int difenca() {
		 return 60-soma();
	 }
}