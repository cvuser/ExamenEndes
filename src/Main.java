import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		1 = new Operación(1,1);
		
	System.out.print("Teclea el parametro A");
	1.setA(teclado.nextDouble());
	System.out.println("Teclea el paramentro b");
	1.setB(teclado.nextDouble());
	
	System.out.println("Teclee la operacion deseada n\1Suma \n2Resta \3Multiplicación \4División");
     int num = teclado.nextInt();
     switch (num){

     case 1: 1.sumar();
     break;
     case 2: 1.restar();
     break;
     case 3: 1.multiplicar();
     break;
     case 4: 1.dividir();
	

	
	
	
	
	
	}


	
		
	}
	


