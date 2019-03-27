package jahvinha;
import java.util.Scanner;

public class Estatistica {
	
	private int MaiorValor;
	
	public Estatistica(int MaiorValor){
		this.MaiorValor = MaiorValor;
	}
	
	public int somatorio() {
		
		int n = 0;
		int counter = MaiorValor;
		
		while(counter > 0) {
			n += counter--;
		}
		return n;
		
}
	public float media() {
		float soma = 0;
		float counter = 0;
		do {
			soma += counter;
			counter++;
			}
		while(MaiorValor >= counter);
		
		return soma/counter;
		
	}
	
	public double variancia() {
		
		double variancia = 0;
		double counter = 1;
		
		
		for (double t = 0; t < MaiorValor; t++) {
			variancia = variancia + Math.pow((counter - this.media()), 2);
			counter++;
		}
		
		return variancia / counter;
	}
	public void imPar() {
		int counter = 0;
		
		while(counter <= MaiorValor) {
			if (counter % 2 == 0) {
				System.out.println(counter + "é par!");
			}
			else {
				System.out.println(counter + "é ímpar!");
			}
			counter++;
		}
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Estatistica peace = new Estatistica(scan.nextInt());
		System.out.println(peace.somatorio());
		System.out.println(peace.media());
		System.out.println(peace.variancia());
		peace.imPar();
	}
}