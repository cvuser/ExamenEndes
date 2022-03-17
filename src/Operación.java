
public class Operación {

	double a, b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Operación [a=" + a + ", b=" + b + "]";
	}

	public Operación(double a, double b) {
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
	int sumar(int a, int b) { // este método recibe dos números y retorna su suma
        return a + b;
     }
	int restar(int a, int b) { // este método recibe dos números y retorna su resta
        return a - b;
     }
	int multiplicar(int a, int b) { // este método recibe dos números y retorna su multiplicación
        return a * b;
     }

	int dividir(int a, int b) { // este método recibe dos números y retorna su division
        return a / b;
     }

}
