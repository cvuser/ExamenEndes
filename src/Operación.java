
public class Operaci�n {

	double a, b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Operaci�n [a=" + a + ", b=" + b + "]";
	}

	public Operaci�n(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	int sumar(int a, int b) { // este m�todo recibe dos n�meros y retorna su suma
        return a + b;
     }
	int restar(int a, int b) { // este m�todo recibe dos n�meros y retorna su resta
        return a - b;
     }
	int multiplicar(int a, int b) { // este m�todo recibe dos n�meros y retorna su multiplicaci�n
        return a * b;
     }

	int dividir(int a, int b) { // este m�todo recibe dos n�meros y retorna su division
        return a / b;
     }

}
