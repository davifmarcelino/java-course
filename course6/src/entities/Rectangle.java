package entities;

public class Rectangle {
	
	public double altura,largura;
	
	public double area() {
		return altura*largura;
	}
	public double perimetro() {
		return (altura*2)+(largura*2);
	}
	public double diagonal() {
		double aux = (altura*altura)+(largura*largura);
		return Math.sqrt(aux);
	}
}
