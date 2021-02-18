package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	public double calcularArea(double a, double b, double c) {
		double area;

		double p = (a + b + c) / 2.0;

		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return area;

	}
}
