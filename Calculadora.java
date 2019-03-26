package jahvinha;
import java.util.Scanner;

public class Calculadora {
	
	public float somar(float load1, float load2) {
		return load1 + load2;
	}
	public float subtrair(float load1, float load2) {
		return load1 - load2;
	}
	public float dividir(float load1, float load2) {
		return load1 / load2;
	}
	public float multiplicar(float load1, float load2) {
		return load1 * load2;
	}

	public static void main (String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		Calculadora calculo = new Calculadora();

		
		float num1, num2;
		char operation;
		
		operation = scan.next().charAt(0);
		
		num1 = scan.nextFloat();
		num2 = scan.nextFloat();
		
		if (operation == '+') {
			System.out.println (calculo.somar(num1, num2));
		}
		else if (operation == '-') {
			System.out.println (calculo.subtrair(num1, num2));
		}
		else if (operation == '*') {
			System.out.println (calculo.multiplicar(num1, num2));
		}
		else {
			System.out.println (calculo.dividir(num1, num2));
		}
		scan.close();
	}
}
//fim
