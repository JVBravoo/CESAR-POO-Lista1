package jahvinha;
import java.util.Scanner;

public class Comparador {

	int num1;
	int num2;
	int num3;
	
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public static void main(String[]args) {
		int x, y, z;
		
		System.out.println("Coloque os tres números separados por espaço: \n");
		
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		if ((x > y) && (x > z)) {
			System.out.println("O maior número é o primeiro");
		}
		else if ((y > x) && (y > z)) {
			System.out.println("O maior número é o segundo");
		}
		else if((z > x) && (z > y)) {
			System.out.println("O maior número é o terceiro");
		}
		else {
			System.out.println("Os números são iguais!");
		}
		input.close();
	}
}
